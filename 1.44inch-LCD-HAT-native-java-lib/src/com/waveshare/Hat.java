package com.waveshare;

import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.PinState;
import com.waveshare.display.BufferedLcdGui;
import com.waveshare.display.Display;
import com.waveshare.display.LcdGui;
import com.waveshare.keyboard.KeyboardHat;
import com.waveshare.listener.KeyInputListener;

public class Hat {
	
	private static final GpioController GPIO_CONTROLLER = GpioFactory.getInstance();
	public final static Hat INSTANCE = new Hat();
	
//	public LcdGui lcdHat;
	public BufferedLcdGui lcdHat;
	public KeyboardHat keyboardHat;
	
	private Hat() {
		lcdHat =  createBufferedLcdDriver();//createLcdGui();
		keyboardHat = createKeyboardHat();
	}
	
	private LcdGui createLcdGui() {
		try {
			return new LcdGui(GPIO_CONTROLLER);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private BufferedLcdGui createBufferedLcdDriver() {
		try {
			return new BufferedLcdGui(GPIO_CONTROLLER, new Display());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private KeyboardHat createKeyboardHat() {
		return new KeyboardHat(GPIO_CONTROLLER);
	}
	
	
	/*
	 * Starting here is only the demo part of the library.
	 */
	
	public static void main(String [] args) throws InterruptedException {
		addControllers();
		
		waitEndlessly();
	}
	
	private static void addControllers() {		
		INSTANCE.keyboardHat.setListener(KeyboardHat.Keys.KEY_A, new KeyInputListener() {
			
			@Override
			public void keyStateChanged(PinState state) {
				if (state.isLow()) {
					try {
						INSTANCE.lcdHat.demo3();
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
