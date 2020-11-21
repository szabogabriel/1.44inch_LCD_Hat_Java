package com.waveshare.display.buffered;

import java.awt.image.BufferedImage;
import java.io.IOException;

import com.pi4j.io.spi.SpiDevice;
import com.waveshare.display.LcdDriver;
import com.waveshare.display.util.ArrayUtil;
import com.waveshare.display.util.ColorUtil;

public class SpiWriteTarget extends LcdDriver implements WriteTarget  {
	
	private short[] currentBuffer;
	
	private LcdDriver driver;
	
	private final int maxLength = SpiDevice.MAX_SUPPORTED_BYTES;
	private byte [] data;
	private int leftover;
	private byte [][] buffer;
	
	public SpiWriteTarget() throws IOException {
		leftover = (DISPLAY.WIDTH * DISPLAY.HEIGHT * 2) % maxLength;
		buffer = new byte [((DISPLAY.WIDTH * DISPLAY.HEIGHT * 2) / maxLength) + (leftover > 0 ? 1 : 0)][maxLength];
		
		setWindows(0, 0, getWidth(), getHeight());
	}
	
	private void fillBuffer(BufferedImage currentBufferedImage) {
		for (int i = 0; i < DISPLAY.WIDTH; i++) {
			for (int j = 0; j < DISPLAY.HEIGHT; j++) {
				currentBuffer[(j * DISPLAY.WIDTH) + i] = (short)ColorUtil.convertRgb888To565(currentBufferedImage.getRGB(i, j));
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

	@Override
	public int getWidth() {
		return DISPLAY.WIDTH;
	}

	@Override
	public int getHeight() {
		return DISPLAY.HEIGHT;
	}

}
