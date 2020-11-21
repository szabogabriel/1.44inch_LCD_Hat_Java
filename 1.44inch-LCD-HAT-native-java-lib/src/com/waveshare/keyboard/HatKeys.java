package com.waveshare.keyboard;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.waveshare.listener.KeyInputListener;

public class HatKeys implements Keyboard {

	private enum KeyMapping {
		KEY_A("Key A", RaspiPin.GPIO_29),
		KEY_B("Key B", RaspiPin.GPIO_28),
		KEY_C("Key C", RaspiPin.GPIO_27),
		JOYSTICK_UP("Joystick UP", RaspiPin.GPIO_22),
		JOYSTICK_DOWN("Joystick DOWN", RaspiPin.GPIO_24),
		JOYSTICK_LEFT("Joystick LEFT", RaspiPin.GPIO_21),
		JOYSTICK_RIGHT("Joystick RIGHT", RaspiPin.GPIO_25),
		JOYSTICK_CENTER("Joystick CENTER", RaspiPin.GPIO_23);

		static {
			for (KeyMapping it : KeyMapping.values()) {

				it.pin.addListener(new GpioPinListenerDigital() {
					@Override
					public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
						if (it.listener != null) {
							it.listener.keyStateChanged(event.getState());
						}
					}
				});
			}
		}

		private final String name;
		private final Pin pinNumber;
		private GpioPinDigitalInput pin = null;
		private KeyInputListener listener = null;

		private KeyMapping(String name, Pin pin) {
			this.name = name;
			this.pinNumber = pin;
			
			this.pin = GpioFactory.getInstance().provisionDigitalInputPin(pinNumber, this.name, PinPullResistance.PULL_UP);
			
			this.pin.addListener(new GpioPinListenerDigital() {
	            @Override
	            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
	            	if (listener != null) {
	            		listener.keyStateChanged(event.getState());
	            	}
	            }
	        });
		}
	}

	public void setListener(Keys key, KeyInputListener listener) {
		KeyMapping.values()[key.ordinal()].listener = listener;
	}

	public void removeListener(Keys key) {
		setListener(key, null);
	}
}
