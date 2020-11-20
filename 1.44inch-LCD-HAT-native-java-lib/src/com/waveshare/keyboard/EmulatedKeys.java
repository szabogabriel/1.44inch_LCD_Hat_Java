package com.waveshare.keyboard;

import com.waveshare.listener.KeyInputListener;

public class EmulatedKeys implements Keyboard {
	
	private KeyInputListener [] listeners = new KeyInputListener [Keys.values().length];

	@Override
	public void setListener(Keys key, KeyInputListener listener) {
		listeners[key.ordinal()] = listener;
	}

	@Override
	public void removeListener(Keys key) {
		setListener(key, null);
	}

}
