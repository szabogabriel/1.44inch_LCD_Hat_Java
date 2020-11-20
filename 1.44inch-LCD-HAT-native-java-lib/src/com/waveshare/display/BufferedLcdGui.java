package com.waveshare.display;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.spi.SpiDevice;
import com.waveshare.display.util.ColorUtil;

public class BufferedLcdGui extends LcdDriver {
	
	private static final int BUFFER_PAGE_AMOUNT = 1;

	private BlockingQueue<BufferedImage> bufferHolder = new ArrayBlockingQueue<>(BUFFER_PAGE_AMOUNT);
	
	private Color backgroundColor = Color.BLACK;
	
	private BufferedImage currentBackground =  new BufferedImage(LCD_WIDTH, LCD_HEIGHT, BufferedImage.TYPE_INT_RGB);
	private BufferedImage currentBufferedImage = new BufferedImage(LCD_WIDTH, LCD_HEIGHT, BufferedImage.TYPE_INT_RGB);

	public BufferedLcdGui(GpioController gpio, Display display) throws IOException {
		super(gpio, display);
		
		setWindows(0, 0, LCD_WIDTH, LCD_HEIGHT);
		
		setBackground(backgroundColor);
		
		setWindows(0, 0, LCD_WIDTH, LCD_HEIGHT);
		
		createDataWriterThread();
	}
	
	private void createDataWriterThread() {
		new Thread(new Runnable() {
			private short [] currentBuffer = newBuffer();
			
			private void fillBuffer(BufferedImage image) {
				for (int i = 0; i < LCD_WIDTH; i++) {
					for (int j = 0; j < LCD_HEIGHT; j++) {
						currentBuffer[(j * LCD_WIDTH) + i] = (short)ColorUtil.convertRgb888To565(currentBufferedImage.getRGB(i, j));
					}
				}
			}
			
			@Override
			public void run() {
				int maxLength = SpiDevice.MAX_SUPPORTED_BYTES;
				byte [] data;
				int leftover = (LCD_WIDTH * LCD_HEIGHT * 2) % maxLength;
				byte [][] buffer = new byte [((LCD_WIDTH * LCD_HEIGHT * 2) / maxLength) + (leftover > 0 ? 1 : 0)][maxLength];
				long t1, t2;
				while (true) {
					try {
						fillBuffer(bufferHolder.take());
						t1 = System.currentTimeMillis();
						data = toByteArray(currentBuffer);
						
						for (int i = 0; i < buffer.length; i++) {
							System.arraycopy(data, i * maxLength, buffer[i], 0, (i + 1 == buffer.length && leftover > 0) ? leftover : maxLength);
						}

						for (int i = 0; i < buffer.length; i++) {
							writeData(buffer[i]);
						}
						
						t2 = System.currentTimeMillis();
						System.out.println("Rendered in: " + (t2 - t1) + "ms.");
					} catch (InterruptedException | IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	private short [] newBuffer() {
		return new short [LCD_WIDTH * LCD_HEIGHT];
	}
	
	public void setBackground(Color color) {
		backgroundColor = color;
		currentBackground.createGraphics().setColor(color);
		currentBackground.createGraphics().fillRect(0, 0, LCD_WIDTH, LCD_HEIGHT);
		currentBufferedImage.createGraphics().drawImage(currentBackground, 0, 0, LCD_WIDTH, LCD_HEIGHT, null);
	}
	
	public void setBackground(BufferedImage image) {
		currentBackground = image;
		currentBufferedImage.createGraphics().drawImage(currentBackground, 0, 0, LCD_WIDTH, LCD_HEIGHT, null);
	}
	
	public void drawLine(Point from, Point to, Color color) {
		currentBufferedImage.createGraphics().setColor(color);
		currentBufferedImage.createGraphics().drawLine(from.x, from.y, to.x, to.y);
	}
	
	public void drawPoint(int x, int y, Color color) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		g.drawLine(x, y, x, y);
	}
	
	public void drawLine(int startX, int startY, int endX, int endY, Color color) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		g.drawLine(startX, startY, endX, endY);
	}
	
	public void drawRectangle(int startX, int startY, int endX, int endY, Color color, boolean filled) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		if (filled) {
			g.fillRect(startX, startY, endX, endY);
		} else {
			g.drawRect(startX, startY, endX, endY);
		}
	}
	
	public void drawCircle(int x, int y, int radius, Color color, boolean filled) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(color);
		if (filled) {
			g.fillOval(x, y, radius, radius);
		} else {
			g.drawOval(x, y, radius, radius);
		}
	}
	
	public void displayCharacter(int x, int y, char character, Color fontColor) {
		displayCharArray(x, y, new char[] {character}, fontColor);
	}
	
	public void displayString(int x, int y, String text, Color fontColor) {
		displayCharArray(x, y, text.toCharArray(), fontColor);
	}
	
	public void displayNumber(int x, int y, int number, Color fontColor) {
		displayCharArray(x, y, Integer.toString(number).toCharArray(), fontColor);
		
	}
	
	public void displayCharArray(int x, int y, char [] toShow, Color fontColor) {
		Graphics2D g = currentBufferedImage.createGraphics();
		g.setColor(fontColor);
		g.drawChars(toShow, 0, toShow.length, x, y);
	}
	
	public void displayBitmap(int x, int y, BufferedImage image) {
		currentBufferedImage.createGraphics().drawImage(image, x, y, null);
	}
	
	public void clear() {
		clear(true);
	}
	
	public void clear(boolean keepBackground) {
		if (keepBackground) {
			setBackground(currentBackground);
		} else {
			setBackground(backgroundColor);
		}
	}
	
	public void clear(Color color) {
		backgroundColor = color;
		clear(false);
	}
	
	public void commit() {
		while (!bufferHolder.offer(currentBufferedImage));
	}

	public void demo3() throws IOException {
		long t1, t2;
		t1 = System.currentTimeMillis();
		System.out.print("GUI Draw Line ");

		drawLine(0, 10, LCD_WIDTH, 10, Color.RED);//2
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 10, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 10, RED,LINE_SOLID, DOT_PIXEL_2X2);
		drawLine(0, 20, LCD_WIDTH, 20, Color.RED);//1
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 20, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 20, RED,LINE_DOTTED, DOT_PIXEL_DFT);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Draw Rectangle ");
		t1 = System.currentTimeMillis();
		drawRectangle(0, 0, 128, 9, Color.BLUE, true);
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

		drawCircle(Cx1, Cy1, Cr, Color.BLUE, false);
		drawCircle(Cx2, Cy2, Cr, Color.BLACK, false);
		drawCircle(Cx3, Cy3, Cr, Color.RED, false);
		drawCircle(Cx4, Cy4, Cr, Color.YELLOW, false);
		drawCircle(Cx5, Cy5, Cr, Color.GREEN, false);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Draw Realistic circles ");
		t1 = System.currentTimeMillis();
		drawCircle(15, 110, 10, Color.CYAN, true);
		drawCircle(LCD_WIDTH - 15, 110, 10, Color.CYAN, true);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Display String ");
		t1 = System.currentTimeMillis();
		displayString(35, 20, "WaveShare", Color.BLUE);
		displayString(32, 33, "Electronic", Color.BLUE);
		displayString(28, 45, "1.44inch TFTLCD", Color.ORANGE);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();

		System.out.print("GUI Display Nummber ");
		t1 = System.currentTimeMillis();
		displayNumber(28, 55, 1234567890, Color.BLUE);
		t2 = System.currentTimeMillis();
		System.out.println("(" + (t2 - t1) + "ms.)");
		commit();
	}
}
