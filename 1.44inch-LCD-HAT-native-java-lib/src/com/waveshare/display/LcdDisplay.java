package com.waveshare.display;

import java.awt.Color;
import java.awt.image.BufferedImage;

public interface LcdDisplay {
	
	void setBackground(Color color);
	
	void setBackground(BufferedImage backgroundImage);
	
	void drawPoint(int x, int y, Color color, int size);
	
	void drawLine(int startX, int startY, int endX, int endY, Color color, int lineWidth);

	void drawRectangle(int startX, int startY, int endX, int endY, Color color, boolean filled, int pixelWidth);
	
	void drawOval(int x, int y, int radius1, int radiu2, Color color, boolean filled, int pixelWidth);
	
	void displayString(String toDisplay, int x, int y, Color fontColor, int stringSize);
	
	void displayBitmap(BufferedImage image, int x, int y);
	
	void clear();
	void clear(boolean keepBackground);
	
	void commit();

}
