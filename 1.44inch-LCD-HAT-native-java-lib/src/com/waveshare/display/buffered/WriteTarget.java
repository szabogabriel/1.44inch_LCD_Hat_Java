package com.waveshare.display.buffered;

import java.awt.image.BufferedImage;

public interface WriteTarget {
	
	void write(BufferedImage image);
	
	int getLcdWidth();
	int getLcdHeight();

}
