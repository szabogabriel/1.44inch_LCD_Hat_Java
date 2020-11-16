package com.waveshare.display.util;

public class ColorUtil {
	
	public enum Rgb565 {
		
		WHITE(0xFFFF),
		BLACK(0x0000),	  
		BLUE(0x001F),  
		BRED(0XF81F),
		GRED(0XFFE0),
		GBLUE(0X07FF),
		RED(0xF800),
		MAGENTA(0xF81F),
		GREEN(0x07E0),
		CYAN(0x7FFF),
		YELLOW(0xFFE0),
		BROWN(0XBC40),
		BRRED(0XFC07),
		GRAY(0X8430),
		;
		
		private char value;
		private Rgb565(int value) {
			this.value = (char)value;
		}
		public char getValue() {
			return value;
		}
	}
	
    public static int convertRgb888To565(int rgb888) {
        return ((rgb888 & 0xf80000) >> 8) | ((rgb888 & 0xfc00) >> 5) | ((rgb888 & 0xf8) >> 3);
    }


}
