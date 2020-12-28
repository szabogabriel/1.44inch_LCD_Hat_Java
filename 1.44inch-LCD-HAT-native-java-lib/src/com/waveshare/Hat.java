package com.waveshare;

import com.waveshare.display.LcdDisplay;
import com.waveshare.keyboard.HatKeyboard;

public class Hat {
	
	public final LcdDisplay lcdHat;
	public final HatKeyboard keyboardHat;
	
	public Hat(HatKeyboard keyboard, LcdDisplay lcdHat) {
		this.lcdHat = lcdHat;
		this.keyboardHat = keyboard;
	}
	
}
