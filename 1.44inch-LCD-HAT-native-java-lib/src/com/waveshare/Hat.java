package com.waveshare;

import com.waveshare.display.LcdDisplay;
import com.waveshare.display.LcdFactory;
import com.waveshare.keyboard.Keyboard;
import com.waveshare.keyboard.KeyboardFactory;

public class Hat {
	
	public final LcdDisplay lcdHat;
	public final Keyboard keyboardHat;
	
	public Hat(KeyboardFactory keyboardFacotry, LcdFactory lcdFactory) {
		lcdHat =  lcdFactory.createDisplay();
		keyboardHat = keyboardFacotry.createKeyboard();
	}
	
}
