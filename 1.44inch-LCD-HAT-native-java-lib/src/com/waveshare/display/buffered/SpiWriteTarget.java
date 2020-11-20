package com.waveshare.display.buffered;

import java.awt.image.BufferedImage;
import java.io.IOException;

import com.pi4j.io.spi.SpiDevice;
import com.waveshare.display.LcdDriver;
import com.waveshare.display.util.ArrayUtil;
import com.waveshare.display.util.ColorUtil;

public class SpiWriteTarget implements WriteTarget {
	
	private final int WIDTH;
	private final int HEIGHT;

	private short[] currentBuffer;
	
	private LcdDriver driver;
	
	private final int maxLength = SpiDevice.MAX_SUPPORTED_BYTES;
	private byte [] data;
	private int leftover;
	private byte [][] buffer;
	
	public SpiWriteTarget(LcdDriver driver, int w, int h) {
		this.driver = driver;
		WIDTH = w;
		HEIGHT = h;
		leftover = (WIDTH * HEIGHT * 2) % maxLength;
		buffer = new byte [((WIDTH * HEIGHT * 2) / maxLength) + (leftover > 0 ? 1 : 0)][maxLength];
	}
	
	private void fillBuffer(BufferedImage currentBufferedImage) {
		for (int i = 0; i < WIDTH; i++) {
			for (int j = 0; j < HEIGHT; j++) {
				currentBuffer[(j * WIDTH) + i] = (short)ColorUtil.convertRgb888To565(currentBufferedImage.getRGB(i, j));
			}
		}
	}

	@Override
	public void write(BufferedImage image) {
		fillBuffer(image);
		data = ArrayUtil.toByteArray(currentBuffer);
		
		for (int i = 0; i < buffer.length; i++) {
			System.arraycopy(data, i * maxLength, buffer[i], 0, (i + 1 == buffer.length && leftover > 0) ? leftover : maxLength);
		}

		for (int i = 0; i < buffer.length; i++) {
			try {
				driver.writeData(buffer[i]);
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}		
	}

}
