package com.waveshare.display;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.waveshare.display.enums.DotPixel;
import com.waveshare.display.enums.DotStyle;
import com.waveshare.display.enums.DrawFill;
import com.waveshare.display.enums.LineStyle;
import com.waveshare.display.font.Font;
import com.waveshare.display.font.Font12;
import com.waveshare.display.font.Font8;
import com.waveshare.display.util.ColorUtil;

public class LcdGui {

	private static Color GUI_BACKGROUND = Color.WHITE;
	private static Color FONT_BACKGROUND = Color.WHITE;

	private final Display DISPLAY;
	private final LcdDriver DRIVER;

	public LcdGui(GpioController controller) throws IOException {
		this.DISPLAY = new Display();
		this.DRIVER = new LcdDriver(controller, DISPLAY);
	}

	public void drawPoint(int pointX, int pointY, Color color, DotPixel pixelWidth, DotStyle dotStyle) throws IOException {
		if (pointX > DISPLAY.lcdDisplayColumn || pointY > DISPLAY.lcdDisplayPage) {
			return;
		}

		int XDir_Num, YDir_Num;
		if (dotStyle == DotStyle.FILL_AROUND) {
			for (XDir_Num = 0; XDir_Num < 2 * pixelWidth.value() - 1; XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < 2 * pixelWidth.value() - 1; YDir_Num++) {
					DRIVER.setPointColor(color, pointX + XDir_Num - pixelWidth.value(),
							pointY + YDir_Num - pixelWidth.value());
				}
			}
		} else {
			for (XDir_Num = 0; XDir_Num < pixelWidth.value(); XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < pixelWidth.value(); YDir_Num++) {
					DRIVER.setPointColor(color, pointX + XDir_Num - 1, pointY + YDir_Num - 1);
				}
			}
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

	public void displayString(int startX, int startY, String text, Font font, Color backgroundColor,
			Color foregroundColor) throws IOException {
		int pointX = startX;
		int pointY = startY;

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
		displayString(pointX, pointY, toPass, font, backgroundColor, foregroundColor);
	}

	public void displayBitmap(int x, int y, BufferedImage image) {
		int width = image.getWidth();
		int height = image.getHeight();
		
		try {
			short [] buffer = new short[width];
			DRIVER.setWindows(x, y, x + width, y + height);
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					buffer[j] = (short)(ColorUtil.convertRgb888To565(image.getRGB(j, i)));
				}
				DRIVER.writeData(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void clear(Color color) {
		try {
			DRIVER.clear(color);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void demo1() throws IOException {
		while (true) {
			DRIVER.clear(Color.BLACK);
			DRIVER.clear(Color.BLUE);
			DRIVER.clear(Color.CYAN);
			DRIVER.clear(Color.DARK_GRAY);
			DRIVER.clear(Color.GRAY);
			DRIVER.clear(Color.GREEN);
			DRIVER.clear(Color.LIGHT_GRAY);
			DRIVER.clear(Color.MAGENTA);
			DRIVER.clear(Color.ORANGE);
			DRIVER.clear(Color.PINK);
			DRIVER.clear(Color.RED);
			DRIVER.clear(Color.WHITE);
			DRIVER.clear(Color.YELLOW);
		}
	}
	
	public void demo2() throws IOException {
		Color randomColor = new Color((int)(Math.random() * (Integer.MAX_VALUE & 0xFFFFFF)));
		int randomx = (int)(Math.random() * 50);
		int randomy = (int)(Math.random() * 50);
		DRIVER.setAreaColor(randomColor, 0 + randomx, 0 + randomy, 128 - randomx, 128 - randomy);
	}

	public void demo3() throws IOException {
		DRIVER.clear(GUI_BACKGROUND);

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
		displayString(35, 20, "WaveShare", new Font12(), GUI_BACKGROUND, Color.BLUE);
		displayString(32, 33, "Electronic", new Font12(), GUI_BACKGROUND, Color.BLUE);
		displayString(28, 45, "1.44inch TFTLCD", new Font8(), Color.RED, Color.ORANGE);

		System.out.printf("GUI Display Nummber \r\n");
		displayNumber(28, 55, 1234567890, new Font12(), GUI_BACKGROUND, Color.BLUE);
	}

	public void flipBacklight() {
		DRIVER.flipBacklight();
	}
	
	private void GUI_Swop(int Point1, int Point2) {
		int Temp;
		Temp = Point1;
		Point1 = Point2;
		Point2 = Temp;
	}
	
}
