package com.waveshare.mock;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JPanel;

import com.waveshare.display.LcdDisplay;
import com.waveshare.display.buffered.BufferedLcdDisplay;
import com.waveshare.display.buffered.WriteTarget;

public class DisplayComponent extends JPanel implements LcdDisplay,  WriteTarget {

	private static final long serialVersionUID = -8582632551055600871L;
	
	private BufferedImage lastImage;
	
	private BufferedLcdDisplay lcdDisplay;
	
	public DisplayComponent() throws IOException {
		lcdDisplay = new BufferedLcdDisplay(this);
	}

	@Override
	public void setBackground(BufferedImage backgroundImage) {
		lcdDisplay.setBackground(backgroundImage);
	}

	@Override
	public void drawPoint(int x, int y, Color color, int size) {
		lcdDisplay.drawPoint(x, y, color, size);
	}

	@Override
	public void drawLine(int startX, int startY, int endX, int endY, Color color, int lineWidth) {
		lcdDisplay.drawLine(startX, startY, endX, endY, color, lineWidth);
	}

	@Override
	public void drawRectangle(int startX, int startY, int endX, int endY, Color color, boolean filled, int pixelWidth) {
		lcdDisplay.drawRectangle(startX, startY, endX, endY, color, filled, pixelWidth);
	}

	@Override
	public void drawOval(int x, int y, int radius1, int radius2, Color color, boolean filled, int pixelWidth) {
		lcdDisplay.drawOval(x, y, radius1, radius2, color, filled, pixelWidth);
	}

	@Override
	public void displayString(String toDisplay, int x, int y, Color fontColor, Font font) {
		lcdDisplay.displayString(toDisplay, x, y, fontColor, font);
	}

	@Override
	public void displayBitmap(BufferedImage image, int x, int y) {
		lcdDisplay.displayBitmap(image, x, y);
	}

	@Override
	public void clear() {
		lcdDisplay.clear();
	}

	@Override
	public void clear(boolean keepBackground) {
		lcdDisplay.clear(keepBackground);
	}

	@Override
	public void commit() {
		lcdDisplay.commit();
	}

	@Override
	public void write(BufferedImage image) {
		lastImage = image;
		repaint();
	}
	
	@Override
	public void print(JComponent component) {
		lcdDisplay.print(component);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if (lastImage != null) {
			g.drawImage(lastImage, 0, 0, null);
		}
	}

	@Override
	public int getLcdWidth() {
		return 128;
	}

	@Override
	public int getLcdHeight() {
		return 128;
	}

	@Override
	public Graphics2D createGraphics() {
		return lcdDisplay.createGraphics();
	}
	
}
