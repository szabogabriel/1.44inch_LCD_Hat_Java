package com.waveshare.display.buffered;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.swing.JComponent;

import com.waveshare.display.LcdDisplay;

public class BufferedLcdDisplay implements LcdDisplay {

	private static final int BUFFER_PAGE_AMOUNT = 1;
	private static final int DISPLAY_REFRESH_INTERVAL = 20; //ms
	private static final int DISPLAY_MAX_SKIP_FRAME = 10;

	private BlockingQueue<BufferedImage> bufferHolder = new ArrayBlockingQueue<>(BUFFER_PAGE_AMOUNT);

	private Color backgroundColor = Color.BLACK;

	private BufferedImage currentBackground;
	volatile private BufferedImage currentBufferedImage;

	private WriteTarget writeTarget = null;
	
	volatile private boolean changed = false;
	
	private int skippedFrame = 0;

	public BufferedLcdDisplay() throws IOException {
		this(new SpiWriteTarget());
	}

	public BufferedLcdDisplay(WriteTarget writeTarget) {
		setWriteTarget(writeTarget);

		currentBackground = new BufferedImage(writeTarget.getLcdWidth(), writeTarget.getLcdHeight(),
				BufferedImage.TYPE_INT_RGB);
		currentBufferedImage = new BufferedImage(writeTarget.getLcdWidth(), writeTarget.getLcdHeight(),
				BufferedImage.TYPE_INT_RGB);

		setBackground(backgroundColor);

		createDataWriterThread();
		
		createBufferUpdateJob();
	}

	public void setWriteTarget(WriteTarget wt) {
		writeTarget = wt;
	}
	
	private void createBufferUpdateJob() {
		new Thread(() -> {
			while(true) {
				if (changed || skippedFrame == DISPLAY_MAX_SKIP_FRAME) {
					skippedFrame = 0;
					commit();
					changed = false;
				} else {
					skippedFrame++;
				}
				
				try {
					Thread.sleep(DISPLAY_REFRESH_INTERVAL);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	private void createDataWriterThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						writeTarget.write(bufferHolder.take());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

	@Override
	public void setBackground(Color color) {
		backgroundColor = color;
		currentBackground.createGraphics().setColor(color);
		currentBackground.createGraphics().fillRect(0, 0, writeTarget.getLcdWidth(), writeTarget.getLcdHeight());
		currentBufferedImage.createGraphics().drawImage(currentBackground, 0, 0, writeTarget.getLcdWidth(),
				writeTarget.getLcdHeight(), null);
		changed = true;
	}

	@Override
	public void setBackground(BufferedImage image) {
		currentBackground = image;
		currentBufferedImage.createGraphics().drawImage(currentBackground, 0, 0, writeTarget.getLcdWidth(),
				writeTarget.getLcdHeight(), null);
		changed = true;
	}

	@Override
	public void drawLine(int startX, int startY, int endX, int endY, Color color, int lineWidth) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		g.drawLine(startX, startY, endX, endY);
		changed = true;
	}

	@Override
	public void drawPoint(int x, int y, Color color, int size) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		g.drawLine(x, y, x, y);
		changed = true;
	}

	@Override
	public void drawRectangle(int startX, int startY, int endX, int endY, Color color, boolean filled, int pixelWidth) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		if (filled) {
			g.fillRect(startX, startY, endX, endY);
		} else {
			g.drawRect(startX, startY, endX, endY);
		}
		changed = true;
	}

	@Override
	public void drawOval(int x, int y, int radius1, int radius2, Color color, boolean filled, int pixelWidth) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		if (filled) {
			g.fillOval(x, y, radius1, radius2);
		} else {
			g.drawOval(x, y, radius1, radius2);
		}
		changed = true;
	}

	@Override
	public void displayString(String text, int x, int y, Color fontColor, Font font) {
		displayCharArray(x, y, text.toCharArray(), fontColor, font);
		changed = true;
	}

	public void displayCharArray(int x, int y, char[] toShow, Color fontColor, Font font) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setFont(font);
		g.setColor(fontColor);
		g.drawChars(toShow, 0, toShow.length, x, y);
		changed = true;
	}

	@Override
	public void displayBitmap(BufferedImage image, int x, int y) {
		currentBufferedImage.createGraphics().drawImage(image, x, y, null);
		changed = true;
	}

	@Override
	public void clear() {
		clear(true);
	}

	@Override
	public void clear(boolean keepBackground) {
		if (keepBackground) {
			setBackground(currentBackground);
		} else {
			setBackground(backgroundColor);
		}
		changed = true;
	}

	@Override
	public void print(JComponent component) {
		component.printAll(currentBufferedImage.createGraphics());
		changed = true;
	}

	public void clear(Color color) {
		backgroundColor = color;
		clear(false);
	}

	@Override
	public void commit() {
		while (!bufferHolder.offer(deepCopy(currentBufferedImage)));
	}

	private BufferedImage deepCopy(BufferedImage bi) {
		ColorModel cm = bi.getColorModel();
		boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
		WritableRaster raster = bi.copyData(null);
		return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
	}

	public void demo3() throws IOException {
		long t1, t2;
		t1 = System.currentTimeMillis();
		System.out.print("GUI Draw Line ");

		drawLine(0, 10, writeTarget.getLcdWidth(), 10, Color.RED, 1);// 2
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 10, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 10, RED,LINE_SOLID, DOT_PIXEL_2X2);
		drawLine(0, 20, writeTarget.getLcdWidth(), 20, Color.RED, 1);// 1
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 20, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 20, RED,LINE_DOTTED, DOT_PIXEL_DFT);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Draw Rectangle ");
		t1 = System.currentTimeMillis();
		drawRectangle(0, 0, 128, 9, Color.BLUE, true, 1);
		// GUI_DrawRectangle(1,1,128,128,RED,DRAW_EMPTY,DOT_PIXEL_2X2);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Draw Olympic Rings ");
		t1 = System.currentTimeMillis();
		int Cx1 = 40, Cy1 = 85, Cr = 12;
		int Cx2 = Cx1 + (int) (2.5 * Cr), Cy2 = Cy1;
		int Cx3 = Cx1 + (5 * Cr), Cy3 = Cy1;
		int Cx4 = (Cx1 + Cx2) / 2, Cy4 = Cy1 + Cr;
		int Cx5 = (Cx2 + Cx3) / 2, Cy5 = Cy1 + Cr;

		drawOval(Cx1, Cy1, Cr, Cr, Color.BLUE, false, 1);
		drawOval(Cx2, Cy2, Cr, Cr, Color.BLACK, false, 1);
		drawOval(Cx3, Cy3, Cr, Cr, Color.RED, false, 1);
		drawOval(Cx4, Cy4, Cr, Cr, Color.YELLOW, false, 1);
		drawOval(Cx5, Cy5, Cr, Cr, Color.GREEN, false, 1);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Draw Realistic circles ");
		t1 = System.currentTimeMillis();
		drawOval(15, 110, 10, 10, Color.CYAN, true, 1);
		drawOval(writeTarget.getLcdWidth() - 15, 110, 10, 10, Color.CYAN, true, 1);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Display String ");
		t1 = System.currentTimeMillis();

		displayString("WaveShare", 35, 20, Color.BLUE, currentBufferedImage.createGraphics().getFont());
		displayString("Electronic", 32, 33, Color.BLUE, currentBufferedImage.createGraphics().getFont());
		displayString("1.44inch TFTLCD", 28, 45, Color.ORANGE, currentBufferedImage.createGraphics().getFont());
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();
	}

	@Override
	public Graphics2D createGraphics() {
		return currentBufferedImage.createGraphics();
	}

	@Override
	public void setBacklight(boolean backlight) {
		writeTarget.setBacklight(backlight);
	}

}
