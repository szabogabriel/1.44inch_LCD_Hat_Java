package com.waveshare.listener;

import com.pi4j.io.gpio.PinState;

public interface KeyInputListener {
	
	void keyStateChanged(PinState state);

}
