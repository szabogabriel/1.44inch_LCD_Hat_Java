package com.waveshare.display.enums;

public enum DotPixel {
	
	DOT_PIXEL_1_1,
	DOT_PIXEL_2_2,
	DOT_PIXEL_3_3,
	DOT_PIXEL_4_4,
	DOT_PIXEL_5_5,
	DOT_PIXEL_6_6,
	DOT_PIXEL_7_7,
	DOT_PIXEL_8_8,
	;
	
	public int value() {
		return this.ordinal() + 1;
	}
}
