package com.waveshare.keyboard.hat;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.waveshare.keyboard.HatKey;
import com.waveshare.keyboard.HatKeyboard;
import com.waveshare.keyboard.listener.KeyInputListener;

public class HatKeyboardImpl implements HatKeyboard {
	
	private KeyInputListener listener;

	private enum KeyMapping {
		KEY_A(HatKey.KEY_A, RaspiPin.GPIO_29),
		KEY_B(HatKey.KEY_B, RaspiPin.GPIO_28),
		KEY_C(HatKey.KEY_C, RaspiPin.GPIO_27),
		JOYSTICK_UP(HatKey.JOYSTICK_UP, RaspiPin.GPIO_22),
		JOYSTICK_DOWN(HatKey.JOYSTICK_DOWN, RaspiPin.GPIO_24),
		JOYSTICK_LEFT(HatKey.JOYSTICK_LEFT, RaspiPin.GPIO_21),
		JOYSTICK_RIGHT(HatKey.JOYSTICK_RIGHT, RaspiPin.GPIO_25),
		JOYSTICK_CENTER(HatKey.JOYSTICK_CENTER, RaspiPin.GPIO_23);

		private final HatKey key;
		private final Pin pinNumber;
		private GpioPinDigitalInput pin = null;
		private KeyInputListener listener = null;

		private KeyMapping(HatKey key, Pin pin) {
			this.key = key;
			this.pinNumber = pin;
			
			this.pin = GpioFactory.getInstance().provisionDigitalInputPin(pinNumber, this.key.name(), PinPullResistance.PULL_UP);
			
			this.pin.addListener(new GpioPinListenerDigital() {
	            @Override
	            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
	            	if (listener != null) {
	            		if (event.getState().isLow()) {
	            			listener.keyPressed(key);
	            		} else {
	            			listener.keyReleased(key);
	            		}
	            	}
	            }
	        });
		}
	}

	public void setListener(KeyInputListener listener) {
		this.listener = listener;
	}

	public void removeListener() {
		setListener(null);
	}
}
