package com.waveshare.display.direct;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JComponent;

import com.waveshare.display.LcdDisplay;
import com.waveshare.display.LcdDriver;
import com.waveshare.display.direct.enums.DotPixel;
import com.waveshare.display.direct.enums.DotStyle;
import com.waveshare.display.direct.enums.DrawFill;
import com.waveshare.display.direct.enums.LineStyle;
import com.waveshare.display.direct.font.Font;
import com.waveshare.display.direct.font.Font12;
import com.waveshare.display.direct.font.Font16;
import com.waveshare.display.direct.font.Font20;
import com.waveshare.display.direct.font.Font24;
import com.waveshare.display.direct.font.Font8;
import com.waveshare.display.util.ColorUtil;

public class DirectLcdDisplay extends LcdDriver implements LcdDisplay {

	private static Color GUI_BACKGROUND = Color.WHITE;
	private static Color FONT_BACKGROUND = Color.WHITE;
	
	private Color backgroundColor = Color.WHITE;

	public DirectLcdDisplay() throws IOException {
		
	}

	public void commit() {
		//not needed
	}
	
	public void clear() {
		clear(false);
	}
	
	public void clear(boolean keepBackground) {
		if (keepBackground) {
			//TODO
		} else {
			clear(backgroundColor);
		}
	}
	
	public void setBackground(Color color) {
		backgroundColor = color;
		clear(backgroundColor);
	}
	
	public void setBackground(BufferedImage image) {
		displayBitmap(image, 0, 0);
	}
	
	public void drawPoint(int x, int y, Color color, int size) {
		try {
			drawPoint(x, y, color, DotPixel.values()[size % DotPixel.values().length], DotStyle.FILL_AROUND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void drawPoint(int pointX, int pointY, Color color, DotPixel pixelWidth, DotStyle dotStyle) throws IOException {
		if (pointX > DISPLAY.lcdDisplayColumn || pointY > DISPLAY.lcdDisplayPage) {
			return;
		}

		int XDir_Num, YDir_Num;
		if (dotStyle == DotStyle.FILL_AROUND) {
			for (XDir_Num = 0; XDir_Num < 2 * pixelWidth.value() - 1; XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < 2 * pixelWidth.value() - 1; YDir_Num++) {
					setPointColor(color, pointX + XDir_Num - pixelWidth.value(),
							pointY + YDir_Num - pixelWidth.value());
				}
			}
		} else {
			for (XDir_Num = 0; XDir_Num < pixelWidth.value(); XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < pixelWidth.value(); YDir_Num++) {
					setPointColor(color, pointX + XDir_Num - 1, pointY + YDir_Num - 1);
				}
			}
		}
	}

	public void drawLine(int startX, int startY, int endX, int endY, Color color, int lineWidth) {
		try {
			drawLine(startX, startY, endX, endY, color, LineStyle.SOLID, DotPixel.values()[lineWidth % DotPixel.values().length]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void drawLine(int startX, int startY, int endX, int endY, Color color, LineStyle lineStyle, DotPixel pixelWidth)
			throws IOException {

		if (startX > DISPLAY.lcdDisplayColumn || startY > DISPLAY.lcdDisplayPage || endX > DISPLAY.lcdDisplayColumn
				|| endY > DISPLAY.lcdDisplayColumn) {
			return;
		}

		if (startX > endX)
			GUI_Swop(startX, endX);
		if (startY > endY)
			GUI_Swop(startY, endY);

		int Xpoint = startX;
		int Ypoint = startY;
		int dx = endX - ((startX >= 0) ? endX - startX : startX - endX);
		int dy = endY - ((startY <= 0) ? endY - startY : startY - endY);

		// Increment direction, 1 is positive, -1 is counter;
		int XAddway = startX < endX ? 1 : -1;
		int YAddway = startY < endY ? 1 : -1;

		// Cumulative error
		int Esp = dx + dy;
		int Line_Style_Temp = 0;

		for (;;) {
			Line_Style_Temp++;
			// Painted dotted line, 2 point is really virtual
			if (lineStyle == LineStyle.DOTTED && Line_Style_Temp % 3 == 0) {
				// printf("LINE_DOTTED\r\n");
				drawPoint(Xpoint, Ypoint, Color.WHITE, pixelWidth, DotStyle.FILL_AROUND);
				Line_Style_Temp = 0;
			} else {
				drawPoint(Xpoint, Ypoint, color, pixelWidth, DotStyle.FILL_AROUND);
			}
			if (2 * Esp >= dy) {
				if (Xpoint == endX)
					break;
				Esp += dy;
				Xpoint += XAddway;
			}
			if (2 * Esp <= dx) {
				if (Ypoint == endY)
					break;
				Esp += dx;
				Ypoint += YAddway;
			}
		}
	}
	
	public void drawRectangle(int startX, int startY, int endX, int endY, Color color, boolean filled, int pixelWidth) {
		try {
			drawRectangle(startX, startY, endX, endY, color, filled ? DrawFill.FILLED : DrawFill.EMPTY, DotPixel.values()[pixelWidth % DotPixel.values().length]);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void drawRectangle(int startX, int startY, int endX, int endY, Color color, DrawFill filled, DotPixel pixelWidth)
			throws IOException {
		if (startX > DISPLAY.lcdDisplayColumn || startY > DISPLAY.lcdDisplayPage || endX > DISPLAY.lcdDisplayColumn
				|| endY > DISPLAY.lcdDisplayPage) {
			return;
		}

		if (startX > endX)
			GUI_Swop(startX, endX);
		if (startY > endY)
			GUI_Swop(startY, endY);

		int Ypoint;
		if (filled == DrawFill.FILLED) {
			for (Ypoint = startY; Ypoint < endY; Ypoint++) {
				drawLine(startX, Ypoint, endX, Ypoint, color, LineStyle.SOLID, pixelWidth);
			}
		} else {
			drawLine(startX, startY, endX, startY, color, LineStyle.SOLID, pixelWidth);
			drawLine(startX, startY, startX, endY, color, LineStyle.SOLID, pixelWidth);
			drawLine(endX, endY, endX, startY, color, LineStyle.SOLID, pixelWidth);
			drawLine(endX, endY, startX, endY, color, LineStyle.SOLID, pixelWidth);
		}
	}
	
	public void drawOval(int x, int y, int radius1, int radiu2, Color color, boolean filled, int pixelWidth) {
		try {
			drawCircle(x, y, radius1, color, filled ? DrawFill.FILLED : DrawFill.EMPTY, DotPixel.values()[pixelWidth % DotPixel.values().length]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void drawCircle(int centerX, int centerY, int radius, Color Color, DrawFill filled, DotPixel pixelWidth)
			throws IOException {
		if (centerX > DISPLAY.lcdDisplayColumn || centerY >= DISPLAY.lcdDisplayPage) {
			return;
		}

		// Draw a circle from(0, R) as a starting point
		int currentX = 0;
		int currentY = radius;

		// Cumulative error,judge the next point of the logo
		int esp = 3 - (radius << 1);

		int sCountY;
		if (filled == DrawFill.FILLED) {
			while (currentX <= currentY) { // Realistic circles
				for (sCountY = currentX; sCountY <= currentY; sCountY++) {
					drawPoint(centerX + currentX, centerY + sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 1
					drawPoint(centerX - currentX, centerY + sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 2
					drawPoint(centerX - sCountY, centerY + currentX, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 3
					drawPoint(centerX - sCountY, centerY - currentX, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 4
					drawPoint(centerX - currentX, centerY - sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 5
					drawPoint(centerX + currentX, centerY - sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 6
					drawPoint(centerX + sCountY, centerY - currentX, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 7
					drawPoint(centerX + sCountY, centerY + currentX, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND);
				}
				if (esp < 0)
					esp += 4 * currentX + 6;
				else {
					esp += 10 + 4 * (currentX - currentY);
					currentY--;
				}
				currentX++;
			}
		} else { // Draw a hollow circle
			while (currentX <= currentY) {
				drawPoint(centerX + currentX, centerY + currentY, Color, pixelWidth, DotStyle.FILL_AROUND); // 1
				drawPoint(centerX - currentX, centerY + currentY, Color, pixelWidth, DotStyle.FILL_AROUND); // 2
				drawPoint(centerX - currentY, centerY + currentX, Color, pixelWidth, DotStyle.FILL_AROUND); // 3
				drawPoint(centerX - currentY, centerY - currentX, Color, pixelWidth, DotStyle.FILL_AROUND); // 4
				drawPoint(centerX - currentX, centerY - currentY, Color, pixelWidth, DotStyle.FILL_AROUND); // 5
				drawPoint(centerX + currentX, centerY - currentY, Color, pixelWidth, DotStyle.FILL_AROUND); // 6
				drawPoint(centerX + currentY, centerY - currentX, Color, pixelWidth, DotStyle.FILL_AROUND); // 7
				drawPoint(centerX + currentY, centerY + currentX, Color, pixelWidth, DotStyle.FILL_AROUND); // 0

				if (esp < 0)
					esp += 4 * currentX + 6;
				else {
					esp += 10 + 4 * (currentX - currentY);
					currentY--;
				}
				currentX++;
			}
		}
	}


	public void displayCharacter(int pointX, int pointY, byte asciiChar, Font font, Color backgroundColor, Color foregroundColor)
			throws IOException {
		if (pointX >= DISPLAY.lcdDisplayColumn || pointY >= DISPLAY.lcdDisplayPage) {
			return;
		}

		int charOffset = (asciiChar - ' ') * font.getHeight()
				* (font.getWidth() / 8 + ((font.getWidth() % 8 > 0) ? 1 : 0));
		int ptr = charOffset;

		for (int page = 0; page < font.getHeight(); page++) {
			for (int column = 0; column < font.getWidth(); column++) {
				// To determine whether the font background color and screen background color is
				// consistent
				if (FONT_BACKGROUND.equals(backgroundColor)) { // this process is to speed up the scan
					if ((font.getTable()[ptr] & (0x80 >> (column % 8))) > 0)
						drawPoint(pointX + column, pointY + page, foregroundColor, DotPixel.DOT_PIXEL_1_1,
								DotStyle.FILL_AROUND);
				} else {
					if ((font.getTable()[ptr] & (0x80 >> (column % 8))) > 0) {
						drawPoint(pointX + column, pointY + page, foregroundColor, DotPixel.DOT_PIXEL_1_1,
								DotStyle.FILL_AROUND);
					} else {
						drawPoint(pointX + column, pointY + page, backgroundColor, DotPixel.DOT_PIXEL_1_1,
								DotStyle.FILL_AROUND);
					}
				}
				// One pixel is 8 bits
				if (column % 8 == 7)
					ptr++;
			} /* Write a line */
			if (font.getWidth() % 8 != 0)
				ptr++;
		} /* Write all */
	}

	@Override
	public void displayString(String text, int startX, int startY, Color foregroundColor, java.awt.Font textfont) {
		try {
		int pointX = startX;
		int pointY = startY;
		
		Font font;
		switch (textfont.getSize()) {
		case 8 : font = new Font8(); break;
		case 12 : font = new Font12(); break;
		case 16 : font = new Font16(); break;
		case 20 : font = new Font20(); break;
		case 24 : font = new Font24(); break;
		default : font = new Font12(); break;
		}

		if (startX >= DISPLAY.lcdDisplayColumn || startY >= DISPLAY.lcdDisplayPage) {
			return;
		}

		int pString = 0;
		while (pString != text.length()) {
			// if X direction filled , reposition to(Xstart,Ypoint),Ypoint is Y direction
			// plus the height of the character
			if ((pointX + font.getWidth()) > DISPLAY.lcdDisplayColumn) {
				pointX = startX;
				pointY += font.getHeight();
			}

			// If the Y direction is full, reposition to(Xstart, Ystart)
			if ((pointY + font.getHeight()) > DISPLAY.lcdDisplayPage) {
				pointX = startX;
				pointY = startY;
			}
			displayCharacter(pointX, pointY, text.getBytes()[pString], font, backgroundColor, foregroundColor);

			// The next character of the address
			pString++;

			// The next word of the abscissa increases the font of the broadband
			pointX += font.getWidth() + 1;
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private final int ARRAY_LEN = 255;

	public void displayNumber(int pointX, int pointY, int nummber, Font font, Color backgroundColor, Color foregroundColor)
			throws IOException {

		int bitNumber = 0, bitString = 0;
		byte arrayString[] = new byte[ARRAY_LEN];
		arrayString[0] = 0;
		byte arrayNumber[] = new byte[ARRAY_LEN];
		arrayString[0] = 0;

		if (pointX >= DISPLAY.lcdDisplayColumn || pointY >= DISPLAY.lcdDisplayPage) {
			return;
		}

		// Converts a number to a string
		while (nummber > 0) {
			arrayNumber[bitNumber] = (byte) ((nummber % 10) + '0');
			bitNumber++;
			nummber /= 10;

		}

		// The string is inverted
		while (bitNumber > 0) {
			arrayString[bitString] = arrayNumber[bitNumber - 1];
			bitString++;
			bitNumber--;
		}

		String toPass = new String(arrayNumber, 0, bitString);
		// show
		displayString(toPass, pointX, pointY, foregroundColor, new java.awt.Font("Verdana", java.awt.Font.PLAIN, 12));
	}

	@Override
	public void displayBitmap(BufferedImage image, int x, int y) {
		int width = image.getWidth();
		int height = image.getHeight();
		
		try {
			short [] buffer = new short[width];
			setWindows(x, y, x + width, y + height);
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					buffer[j] = (short)(ColorUtil.convertRgb888To565(image.getRGB(j, i)));
				}
				writeData(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void clear(Color color) {
		try {
			super.clear(color);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void demo1() throws IOException {
		while (true) {
			clear(Color.BLACK);
			clear(Color.BLUE);
			clear(Color.CYAN);
			clear(Color.DARK_GRAY);
			clear(Color.GRAY);
			clear(Color.GREEN);
			clear(Color.LIGHT_GRAY);
			clear(Color.MAGENTA);
			clear(Color.ORANGE);
			clear(Color.PINK);
			clear(Color.RED);
			clear(Color.WHITE);
			clear(Color.YELLOW);
		}
	}
	
	public void demo2() throws IOException {
		Color randomColor = new Color((int)(Math.random() * (Integer.MAX_VALUE & 0xFFFFFF)));
		int randomx = (int)(Math.random() * 50);
		int randomy = (int)(Math.random() * 50);
		setAreaColor(randomColor, 0 + randomx, 0 + randomy, 128 - randomx, 128 - randomy);
	}

	public void demo3() throws IOException {
		clear(GUI_BACKGROUND);

		System.out.printf("GUI Draw Line \r\n");

		drawLine(0, 10, DISPLAY.lcdDisplayColumn, 10, Color.RED, LineStyle.SOLID, DotPixel.DOT_PIXEL_2_2);
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 10, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 10, RED,LINE_SOLID, DOT_PIXEL_2X2);
		drawLine(0, 20, DISPLAY.lcdDisplayColumn, 20, Color.RED, LineStyle.DOTTED, DotPixel.DOT_PIXEL_1_1);
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 20, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 20, RED,LINE_DOTTED, DOT_PIXEL_DFT);

		System.out.printf("GUI Draw Rectangle \r\n");
		drawRectangle(0, 0, 128, 9, Color.BLUE, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);
		// GUI_DrawRectangle(1,1,128,128,RED,DRAW_EMPTY,DOT_PIXEL_2X2);

		System.out.printf("GUI Draw Olympic Rings\r\n");
		int Cx1 = 40, Cy1 = 85, Cr = 12;
		int Cx2 = Cx1 + (int) (2.5 * Cr), Cy2 = Cy1;
		int Cx3 = Cx1 + (5 * Cr), Cy3 = Cy1;
		int Cx4 = (Cx1 + Cx2) / 2, Cy4 = Cy1 + Cr;
		int Cx5 = (Cx2 + Cx3) / 2, Cy5 = Cy1 + Cr;

		drawCircle(Cx1, Cy1, Cr, Color.BLUE, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		drawCircle(Cx2, Cy2, Cr, Color.BLACK, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		drawCircle(Cx3, Cy3, Cr, Color.RED, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		drawCircle(Cx4, Cy4, Cr, Color.YELLOW, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		drawCircle(Cx5, Cy5, Cr, Color.GREEN, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);

		System.out.printf("GUI Draw Realistic circles\r\n");
		drawCircle(15, 110, 10, Color.CYAN, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);
		drawCircle(DISPLAY.lcdDisplayColumn - 15, 110, 10, Color.CYAN, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);

		System.out.printf("GUI Display String \r\n");
		displayString("WaveShare", 35, 20, Color.BLUE, new java.awt.Font("Verdana", java.awt.Font.PLAIN, 12));
		displayString("Electronic", 32, 33, Color.BLUE, new java.awt.Font("Verdana", java.awt.Font.PLAIN, 12));
		displayString("1.44inch TFTLCD", 28, 45, Color.ORANGE, new java.awt.Font("Verdana", java.awt.Font.PLAIN, 8));

		System.out.printf("GUI Display Nummber \r\n");
		displayNumber(28, 55, 1234567890, new Font12(), GUI_BACKGROUND, Color.BLUE);
	}

	public void flipBacklight() {
		super.flipBacklight();
	}
	
	private void GUI_Swop(int Point1, int Point2) {
		int Temp;
		Temp = Point1;
		Point1 = Point2;
		Point2 = Temp;
	}

	@Override
	public void print(JComponent component) {
		// TODO Auto-generated method stub
	}
	
}
