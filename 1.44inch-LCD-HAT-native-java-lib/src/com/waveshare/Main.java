package com.waveshare;

import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.PinState;
import com.waveshare.display.LcdGui;
import com.waveshare.keyboard.KeyboardHat;
import com.waveshare.listener.KeyInputListener;

public class Main {
	
	private static GpioController INSTANCE;
	private static LcdGui lcdHat;
	private static KeyboardHat keyboardHat;
	
	public static void main(String [] args) throws InterruptedException {
		INSTANCE = GpioFactory.getInstance();
		
		lcdHat = createLcdGui();
		keyboardHat = createKeyboardHat();
		
		waitEndlessly();
	}
	
	private static LcdGui createLcdGui() {
		try {
			return new LcdGui(INSTANCE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static KeyboardHat createKeyboardHat() {
		KeyboardHat keyboardInput = new KeyboardHat(INSTANCE);
		
		keyboardInput.setListener(KeyboardHat.Keys.KEY_A, new KeyInputListener() {
			@Override
			public void keyStateChanged(PinState state) {
				if (state.isLow()) {
					lcdHat.flipBacklight();
				}
			}
		});
		keyboardInput.setListener(KeyboardHat.Keys.KEY_B, new KeyInputListener() {
			@Override
			public void keyStateChanged(PinState state) {
				if (state.isLow()) {
					try {
						System.out.println("Calling demo.");
						//lcdHat.demo();
						lcdHat.demo3();
						System.out.println("Done.");
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
		keyboardInput.setListener(KeyboardHat.Keys.KEY_C, new KeyInputListener() {
			@Override
			public void keyStateChanged(PinState state) {
				System.exit(0);
			}
		});
		
		return keyboardInput;
	}
	
	private static void waitEndlessly() {
		while (true) {
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
