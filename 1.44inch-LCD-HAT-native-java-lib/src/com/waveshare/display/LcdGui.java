package com.waveshare.display;

import java.awt.Color;
import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.waveshare.display.enums.DotPixel;
import com.waveshare.display.enums.DotStyle;
import com.waveshare.display.enums.DrawFill;
import com.waveshare.display.enums.LineStyle;
import com.waveshare.display.font.Font;
import com.waveshare.display.font.Font12;
import com.waveshare.display.font.Font8;

public class LcdGui {

	private static Color GUI_BACKGROUND = Color.WHITE;
	private static Color FONT_BACKGROUND = Color.WHITE;

	private final Display DISPLAY;
	private final LcdDriver DRIVER;

	public LcdGui(GpioController controller) throws IOException {
		this.DISPLAY = new Display();
		this.DRIVER = new LcdDriver(controller, DISPLAY);
	}

	private void GUI_Swop(int Point1, int Point2) {
		int Temp;
		Temp = Point1;
		Point1 = Point2;
		Point2 = Temp;
	}

	/********************************************************************************
	 * function: Draw Point(Xpoint, Ypoint) Fill the color parameter: Xpoint : The x
	 * coordinate of the point Ypoint : The y coordinate of the point Color : Set
	 * color Dot_Pixel : point size
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DrawPoint(int Xpoint, int Ypoint, Color color, DotPixel Dot_Pixel, DotStyle DOT_STYLE) throws IOException {
		if (Xpoint > DISPLAY.lcdDisplayColumn || Ypoint > DISPLAY.lcdDisplayPage) {
			return;
		}

		int XDir_Num, YDir_Num;
		if (DOT_STYLE == DotStyle.FILL_AROUND) {
			for (XDir_Num = 0; XDir_Num < 2 * Dot_Pixel.value() - 1; XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < 2 * Dot_Pixel.value() - 1; YDir_Num++) {
					DRIVER.setPointColor(color, Xpoint + XDir_Num - Dot_Pixel.value(),
							Ypoint + YDir_Num - Dot_Pixel.value());
				}
			}
		} else {
			for (XDir_Num = 0; XDir_Num < Dot_Pixel.value(); XDir_Num++) {
				for (YDir_Num = 0; YDir_Num < Dot_Pixel.value(); YDir_Num++) {
					DRIVER.setPointColor(color, Xpoint + XDir_Num - 1, Ypoint + YDir_Num - 1);
				}
			}
		}
	}

	/********************************************************************************
	 * function: Draw a line of arbitrary slope parameter: Xstart ：Starting x point
	 * coordinates Ystart ：Starting x point coordinates Xend ：End point x coordinate
	 * Yend ：End point y coordinate Color ：The color of the line segment
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DrawLine(int Xstart, int Ystart, int Xend, int Yend, Color color, LineStyle Line_Style, DotPixel Dot_Pixel)
			throws IOException {

		if (Xstart > DISPLAY.lcdDisplayColumn || Ystart > DISPLAY.lcdDisplayPage || Xend > DISPLAY.lcdDisplayColumn
				|| Yend > DISPLAY.lcdDisplayColumn) {
			return;
		}

		if (Xstart > Xend)
			GUI_Swop(Xstart, Xend);
		if (Ystart > Yend)
			GUI_Swop(Ystart, Yend);

		int Xpoint = Xstart;
		int Ypoint = Ystart;
		int dx = Xend - ((Xstart >= 0) ? Xend - Xstart : Xstart - Xend);
		int dy = Yend - ((Ystart <= 0) ? Yend - Ystart : Ystart - Yend);

		// Increment direction, 1 is positive, -1 is counter;
		int XAddway = Xstart < Xend ? 1 : -1;
		int YAddway = Ystart < Yend ? 1 : -1;

		// Cumulative error
		int Esp = dx + dy;
		int Line_Style_Temp = 0;

		for (;;) {
			Line_Style_Temp++;
			// Painted dotted line, 2 point is really virtual
			if (Line_Style == LineStyle.DOTTED && Line_Style_Temp % 3 == 0) {
				// printf("LINE_DOTTED\r\n");
				GUI_DrawPoint(Xpoint, Ypoint, Color.WHITE, Dot_Pixel, DotStyle.FILL_AROUND);
				Line_Style_Temp = 0;
			} else {
				GUI_DrawPoint(Xpoint, Ypoint, color, Dot_Pixel, DotStyle.FILL_AROUND);
			}
			if (2 * Esp >= dy) {
				if (Xpoint == Xend)
					break;
				Esp += dy;
				Xpoint += XAddway;
			}
			if (2 * Esp <= dx) {
				if (Ypoint == Yend)
					break;
				Esp += dx;
				Ypoint += YAddway;
			}
		}
	}

	/********************************************************************************
	 * function: Draw a rectangle parameter: Xstart ：Rectangular Starting x point
	 * coordinates Ystart ：Rectangular Starting x point coordinates Xend
	 * ：Rectangular End point x coordinate Yend ：Rectangular End point y coordinate
	 * Color ：The color of the Rectangular segment Filled : Whether it is filled---
	 * 1 solid 0：empty
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DrawRectangle(int Xstart, int Ystart, int Xend, int Yend, Color color, DrawFill filled, DotPixel Dot_Pixel)
			throws IOException {
		if (Xstart > DISPLAY.lcdDisplayColumn || Ystart > DISPLAY.lcdDisplayPage || Xend > DISPLAY.lcdDisplayColumn
				|| Yend > DISPLAY.lcdDisplayPage) {
			return;
		}
		// printf("sLCD_DIS.LCD_Dis_Column = %d\r\n",sLCD_DIS.LCD_Dis_Column);
		// printf("sLCD_DIS.LCD_Dis_Page = %d\r\n",sLCD_DIS.LCD_Dis_Page);
		if (Xstart > Xend)
			GUI_Swop(Xstart, Xend);
		if (Ystart > Yend)
			GUI_Swop(Ystart, Yend);

		int Ypoint;
		if (filled == DrawFill.FILLED) {
			for (Ypoint = Ystart; Ypoint < Yend; Ypoint++) {
				GUI_DrawLine(Xstart, Ypoint, Xend, Ypoint, color, LineStyle.SOLID, Dot_Pixel);
			}
		} else {
			GUI_DrawLine(Xstart, Ystart, Xend, Ystart, color, LineStyle.SOLID, Dot_Pixel);
			GUI_DrawLine(Xstart, Ystart, Xstart, Yend, color, LineStyle.SOLID, Dot_Pixel);
			GUI_DrawLine(Xend, Yend, Xend, Ystart, color, LineStyle.SOLID, Dot_Pixel);
			GUI_DrawLine(Xend, Yend, Xstart, Yend, color, LineStyle.SOLID, Dot_Pixel);
		}
	}

	/********************************************************************************
	 * function: Use the 8-point method to draw a circle of the specified size at
	 * the specified position. parameter: X_Center ：Center X coordinate Y_Center
	 * ：Center Y coordinate Radius ：circle Radius Color ：The color of the ：circle
	 * segment Filled : Whether it is filled: 1 filling 0：Do not
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DrawCircle(int X_Center, int Y_Center, int Radius, Color Color, DrawFill Draw_Fill, DotPixel Dot_Pixel)
			throws IOException {
		if (X_Center > DISPLAY.lcdDisplayColumn || Y_Center >= DISPLAY.lcdDisplayPage) {
			return;
		}

		// Draw a circle from(0, R) as a starting point
		int XCurrent, YCurrent;
		XCurrent = 0;
		YCurrent = Radius;

		// Cumulative error,judge the next point of the logo
		int Esp = 3 - (Radius << 1);

		int sCountY;
		if (Draw_Fill == DrawFill.FILLED) {
			while (XCurrent <= YCurrent) { // Realistic circles
				for (sCountY = XCurrent; sCountY <= YCurrent; sCountY++) {
					GUI_DrawPoint(X_Center + XCurrent, Y_Center + sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 1
					GUI_DrawPoint(X_Center - XCurrent, Y_Center + sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 2
					GUI_DrawPoint(X_Center - sCountY, Y_Center + XCurrent, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 3
					GUI_DrawPoint(X_Center - sCountY, Y_Center - XCurrent, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 4
					GUI_DrawPoint(X_Center - XCurrent, Y_Center - sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 5
					GUI_DrawPoint(X_Center + XCurrent, Y_Center - sCountY, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 6
					GUI_DrawPoint(X_Center + sCountY, Y_Center - XCurrent, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND); // 7
					GUI_DrawPoint(X_Center + sCountY, Y_Center + XCurrent, Color, DotPixel.DOT_PIXEL_1_1,
							DotStyle.FILL_AROUND);
				}
				if (Esp < 0)
					Esp += 4 * XCurrent + 6;
				else {
					Esp += 10 + 4 * (XCurrent - YCurrent);
					YCurrent--;
				}
				XCurrent++;
			}
		} else { // Draw a hollow circle
			while (XCurrent <= YCurrent) {
				GUI_DrawPoint(X_Center + XCurrent, Y_Center + YCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 1
				GUI_DrawPoint(X_Center - XCurrent, Y_Center + YCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 2
				GUI_DrawPoint(X_Center - YCurrent, Y_Center + XCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 3
				GUI_DrawPoint(X_Center - YCurrent, Y_Center - XCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 4
				GUI_DrawPoint(X_Center - XCurrent, Y_Center - YCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 5
				GUI_DrawPoint(X_Center + XCurrent, Y_Center - YCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 6
				GUI_DrawPoint(X_Center + YCurrent, Y_Center - XCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 7
				GUI_DrawPoint(X_Center + YCurrent, Y_Center + XCurrent, Color, Dot_Pixel, DotStyle.FILL_AROUND); // 0

				if (Esp < 0)
					Esp += 4 * XCurrent + 6;
				else {
					Esp += 10 + 4 * (XCurrent - YCurrent);
					YCurrent--;
				}
				XCurrent++;
			}
		}
	}

	/********************************************************************************
	 * function: Show English characters parameter: Xpoint ：X coordinate Ypoint ：Y
	 * coordinate Acsii_Char ：To display the English characters Font ：A structure
	 * pointer that displays a character size Color_Background : Select the
	 * background color of the English character Color_Foreground : Select the
	 * foreground color of the English character
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DisChar(int Xpoint, int Ypoint, byte Acsii_Char, Font font, Color Color_Background, Color Color_Foreground)
			throws IOException {
		if (Xpoint >= DISPLAY.lcdDisplayColumn || Ypoint >= DISPLAY.lcdDisplayPage) {
			return;
		}

		int Char_Offset = (Acsii_Char - ' ') * font.getHeight()
				* (font.getWidth() / 8 + ((font.getWidth() % 8 > 0) ? 1 : 0));
		int ptr = Char_Offset;

		for (int page = 0; page < font.getHeight(); page++) {
			for (int column = 0; column < font.getWidth(); column++) {
				// To determine whether the font background color and screen background color is
				// consistent
				if (FONT_BACKGROUND.equals(Color_Background)) { // this process is to speed up the scan
					if ((font.getTable()[ptr] & (0x80 >> (column % 8))) > 0)
						GUI_DrawPoint(Xpoint + column, Ypoint + page, Color_Foreground, DotPixel.DOT_PIXEL_1_1,
								DotStyle.FILL_AROUND);
				} else {
					if ((font.getTable()[ptr] & (0x80 >> (column % 8))) > 0) {
						GUI_DrawPoint(Xpoint + column, Ypoint + page, Color_Foreground, DotPixel.DOT_PIXEL_1_1,
								DotStyle.FILL_AROUND);
					} else {
						GUI_DrawPoint(Xpoint + column, Ypoint + page, Color_Background, DotPixel.DOT_PIXEL_1_1,
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

	/********************************************************************************
	 * function: Display the string parameter: Xstart ：X coordinate Ystart ：Y
	 * coordinate pString ：The first address of the English string to be displayed
	 * Font ：A structure pointer that displays a character size Color_Background :
	 * Select the background color of the English character Color_Foreground :
	 * Select the foreground color of the English character
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void GUI_DisString_EN(int Xstart, int Ystart, String text, Font font, Color Color_Background,
			Color Color_Foreground) throws IOException {
		int Xpoint = Xstart;
		int Ypoint = Ystart;

		if (Xstart >= DISPLAY.lcdDisplayColumn || Ystart >= DISPLAY.lcdDisplayPage) {
			return;
		}

		int pString = 0;
		while (pString != text.length()) {
			// if X direction filled , reposition to(Xstart,Ypoint),Ypoint is Y direction
			// plus the height of the character
			if ((Xpoint + font.getWidth()) > DISPLAY.lcdDisplayColumn) {
				Xpoint = Xstart;
				Ypoint += font.getHeight();
			}

			// If the Y direction is full, reposition to(Xstart, Ystart)
			if ((Ypoint + font.getHeight()) > DISPLAY.lcdDisplayPage) {
				Xpoint = Xstart;
				Ypoint = Ystart;
			}
			GUI_DisChar(Xpoint, Ypoint, text.getBytes()[pString], font, Color_Background, Color_Foreground);

			// The next character of the address
			pString++;

			// The next word of the abscissa increases the font of the broadband
			Xpoint += font.getWidth() + 1;
		}
	}

	/****************************************
	 * WHITE**************************************** function: Display the string
	 * parameter: Xstart ：X coordinate Ystart : Y coordinate Nummber: The number
	 * displayed Font ：A structure pointer that displays a character size
	 * Color_Background : Select the background color of the English character
	 * Color_Foreground : Select the foreground color of the English character
	 ********************************************************************************/
	private final int ARRAY_LEN = 255;

	public void GUI_DisNum(int Xpoint, int Ypoint, int nummber, Font font, Color Color_Background, Color Color_Foreground)
			throws IOException {

		int Num_Bit = 0, Str_Bit = 0;
		byte Str_Array[] = new byte[ARRAY_LEN];
		Str_Array[0] = 0;
		byte Num_Array[] = new byte[ARRAY_LEN];
		Str_Array[0] = 0;

		if (Xpoint >= DISPLAY.lcdDisplayColumn || Ypoint >= DISPLAY.lcdDisplayPage) {
			return;
		}

		// Converts a number to a string
		while (nummber > 0) {
			Num_Array[Num_Bit] = (byte) ((nummber % 10) + '0');
			Num_Bit++;
			nummber /= 10;

		}

		// The string is inverted
		while (Num_Bit > 0) {
			Str_Array[Str_Bit] = Num_Array[Num_Bit - 1];
			Str_Bit++;
			Num_Bit--;
		}

		String toPass = new String(Num_Array, 0, Str_Bit);
		// show
		GUI_DisString_EN(Xpoint, Ypoint, toPass, font, Color_Background, Color_Foreground);
	}

//	void GUI_Disbitmap(int Xpoint, int Ypoint, const unsigned char *pBmp,
//							int Width, int Height)
//	{
//	    int i, j, byteWidth = (Width + 7)/8;
//	    for(j = 0; j < Height; j++) {
//	        for(i = 0; i <Width; i ++) {
//	            if(*(pBmp + j*byteWidth + i/8) & (128 >> (i & 7))) {
//	                GUI_DrawPoint(Xpoint+i, Ypoint+j, WHITE, DOT_PIXEL_DFT, DotStyle.FILL_AROUND);
//	            }
//	        }
//	    }
//	}

	public void simpleDemo() throws IOException {
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
	
	public void multiDemo() throws IOException {
		Color randomColor = new Color((int)(Math.random() * (Integer.MAX_VALUE & 0xFFFFFF)));
		int randomx = (int)(Math.random() * 50);
		int randomy = (int)(Math.random() * 50);
		DRIVER.setAreaColor(randomColor, 0 + randomx, 0 + randomy, 128 - randomx, 128 - randomy);
	}
	/********************************************************************************
	 * function: LCD_Show parameter:
	 * 
	 * @throws IOException
	 ********************************************************************************/
	public void demo() throws IOException {
		DRIVER.clear(GUI_BACKGROUND);

		System.out.printf("GUI Draw Line \r\n");

		GUI_DrawLine(0, 10, DISPLAY.lcdDisplayColumn, 10, Color.RED, LineStyle.SOLID, DotPixel.DOT_PIXEL_2_2);
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 10, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 10, RED,LINE_SOLID, DOT_PIXEL_2X2);
		GUI_DrawLine(0, 20, DISPLAY.lcdDisplayColumn, 20, Color.RED, LineStyle.DOTTED, DotPixel.DOT_PIXEL_1_1);
		// GUI_DrawLine(0, sLCD_DIS.LCD_Dis_Page - 20, sLCD_DIS.LCD_Dis_Column,
		// sLCD_DIS.LCD_Dis_Page - 20, RED,LINE_DOTTED, DOT_PIXEL_DFT);

		System.out.printf("GUI Draw Rectangle \r\n");
		GUI_DrawRectangle(0, 0, 128, 9, Color.BLUE, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);
		// GUI_DrawRectangle(1,1,128,128,RED,DRAW_EMPTY,DOT_PIXEL_2X2);

		System.out.printf("GUI Draw Olympic Rings\r\n");
		int Cx1 = 40, Cy1 = 85, Cr = 12;
		int Cx2 = Cx1 + (int) (2.5 * Cr), Cy2 = Cy1;
		int Cx3 = Cx1 + (5 * Cr), Cy3 = Cy1;
		int Cx4 = (Cx1 + Cx2) / 2, Cy4 = Cy1 + Cr;
		int Cx5 = (Cx2 + Cx3) / 2, Cy5 = Cy1 + Cr;

		GUI_DrawCircle(Cx1, Cy1, Cr, Color.BLUE, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		GUI_DrawCircle(Cx2, Cy2, Cr, Color.BLACK, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		GUI_DrawCircle(Cx3, Cy3, Cr, Color.RED, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		GUI_DrawCircle(Cx4, Cy4, Cr, Color.YELLOW, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);
		GUI_DrawCircle(Cx5, Cy5, Cr, Color.GREEN, DrawFill.EMPTY, DotPixel.DOT_PIXEL_1_1);

		System.out.printf("GUI Draw Realistic circles\r\n");
		GUI_DrawCircle(15, 110, 10, Color.CYAN, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);
		GUI_DrawCircle(DISPLAY.lcdDisplayColumn - 15, 110, 10, Color.CYAN, DrawFill.FILLED, DotPixel.DOT_PIXEL_1_1);

		System.out.printf("GUI Display String \r\n");
		GUI_DisString_EN(35, 20, "WaveShare", new Font12(), GUI_BACKGROUND, Color.BLUE);
		GUI_DisString_EN(32, 33, "Electronic", new Font12(), GUI_BACKGROUND, Color.BLUE);
		GUI_DisString_EN(28, 45, "1.44inch TFTLCD", new Font8(), Color.RED, Color.ORANGE);

		System.out.printf("GUI Display Nummber \r\n");
		GUI_DisNum(28, 55, 1234567890, new Font12(), GUI_BACKGROUND, Color.BLUE);
	}

	public void flipBacklight() {
		DRIVER.flipBacklight();
	}
}
