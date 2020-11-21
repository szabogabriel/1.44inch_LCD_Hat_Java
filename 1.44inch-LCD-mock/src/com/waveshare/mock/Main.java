package com.waveshare.mock;

import java.awt.Color;
import java.io.IOException;

import com.waveshare.Hat;
import com.waveshare.display.LcdDisplay;
import com.waveshare.keyboard.Keys;

public class Main {
	
	public static void main(String [] args) throws IOException, InterruptedException {
		Hat hat = createHat();
		
		hat.keyboardHat.setListener(Keys.JOYSTICK_CENTER, e -> System.out.println("Yesss, we did it! " + e.name()));
		
		Thread.sleep(1000);
		
		LcdDisplay display = hat.lcdHat;
		display.clear();
		display.drawRectangle(0, 0, 30, 30, Color.PINK, true, 1);
		display.commit();
		
		
	}
	
	public static Hat createHat() throws IOException {
		EmulatedKeys emulatedKeys = new EmulatedKeys();
		MockedHat mh = new MockedHat(emulatedKeys);
		
		Hat ret = new Hat(() -> emulatedKeys, () -> mh.getDisplay());
		
		return ret;
	}

}
