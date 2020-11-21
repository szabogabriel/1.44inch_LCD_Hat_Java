package com.waveshare;

import java.io.IOException;

import com.pi4j.io.gpio.PinState;
import com.waveshare.display.LcdFactory;
import com.waveshare.display.buffered.BufferedLcdDisplay;
import com.waveshare.keyboard.KeyboardFactory;
import com.waveshare.keyboard.Keys;
import com.waveshare.listener.KeyInputListener;

public class Demo {
	
	private static Hat hat;
	
	public static void main(String [] args) throws InterruptedException {
		hat = new Hat(KeyboardFactory.HARDWARE, LcdFactory.BUFFERED);
		
		addControllers();
		
		waitEndlessly();
	}
	
	private static void addControllers() {		
		hat.keyboardHat.setListener(Keys.KEY_A, new KeyInputListener() {
			
			@Override
			public void keyStateChanged(PinState state) {
				if (state.isLow()) {
					try {
						((BufferedLcdDisplay)hat.lcdHat).demo3();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
//		INSTANCE.keyboardHat.setListener(KeyboardHat.Keys.KEY_A, new KeyInputListener() {
//			@Override
//			public void keyStateChanged(PinState state) {
//				if (state.isLow()) {
//					INSTANCE.lcdHat.flipBacklight();
//				}
//			}
//		});
//		INSTANCE.keyboardHat.setListener(KeyboardHat.Keys.KEY_B, new KeyInputListener() {
//			@Override
//			public void keyStateChanged(PinState state) {
//				if (state.isLow()) {
//					try {
//						System.out.println("Calling demo.");
//						BufferedImage image = ImageIO.read(new File("sky.bmp"));
//						INSTANCE.lcdHat.displayBitmap(0, 0, image);
//						System.out.println("Done.");
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		});
//		INSTANCE.keyboardHat.setListener(KeyboardHat.Keys.KEY_C, new KeyInputListener() {
//			@Override
//			public void keyStateChanged(PinState state) {
//				try {
//					INSTANCE.lcdHat.demo2();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
	
	private static void waitEndlessly() {
		while (true) {
			try {
				Thread.sleep(30);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
