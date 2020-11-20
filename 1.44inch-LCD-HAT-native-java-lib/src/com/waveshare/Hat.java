package com.waveshare;

import com.waveshare.display.LcdDisplay;
import com.waveshare.display.LcdFactory;
import com.waveshare.keyboard.Keyboard;
import com.waveshare.keyboard.KeyboardFactory;

public class Hat {
	
	public LcdDisplay lcdHat;
	public Keyboard keyboardHat;
	
	public Hat(KeyboardFactory keyboardFacotry, LcdFactory lcdFactory) {
		lcdHat =  lcdFactory.createDisplay();
		keyboardHat = keyboardFacotry.createKeyboard();
	}
	
	/*
	 * Starting here is only the demo part of the library.
	 */
	
	public static void main(String [] args) throws InterruptedException {
		addControllers();
		
		waitEndlessly();
	}
	
	private static void addControllers() {		
//		INSTANCE.keyboardHat.setListener(KeyboardHat.HatKeys.KEY_A, new KeyInputListener() {
//			
//			@Override
//			public void keyStateChanged(PinState state) {
//				if (state.isLow()) {
//					try {
//						INSTANCE.lcdHat.demo3();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}
//		});
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
