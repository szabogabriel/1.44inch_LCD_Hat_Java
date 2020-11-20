package com.waveshare.display;

import com.waveshare.display.direct.enums.ScanDirection;

public class DisplayDetails {
	
	public final int WIDTH = 128;
	public final int HEIGHT = 128;
	public final int LCD_X = 2;
	public final int LCD_Y = 1;
	
	public int lcdDisplayColumn;
	public int lcdDisplayPage;
	public ScanDirection scanDirection;
	public int lcdXAdjust;
	public int lcdYAdjust;

}
