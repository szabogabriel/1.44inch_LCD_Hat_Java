package com.waveshare;

import java.io.IOException;

import com.waveshare.display.LcdFactories;
import com.waveshare.display.buffered.BufferedLcdDisplay;
import com.waveshare.keyboard.HatKey;
import com.waveshare.keyboard.KeyboardFactories;
import com.waveshare.keyboard.listener.KeyInputListener;

public class Demo {
	
	private static Hat hat;
	
	public static void main(String [] args) throws InterruptedException {
		hat = new Hat(KeyboardFactories.HARDWARE, LcdFactories.BUFFERED);
		
		addControllers();
		
		waitEndlessly();
	}
	
	private static void addControllers() {		
		hat.keyboardHat.setListener(new KeyInputListener() {
			
			@Override
			public void keyPressed(HatKey key) {
				try {
					((BufferedLcdDisplay)hat.lcdHat).demo3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}

			@Override
			public void keyReleased(HatKey key) {
				
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
