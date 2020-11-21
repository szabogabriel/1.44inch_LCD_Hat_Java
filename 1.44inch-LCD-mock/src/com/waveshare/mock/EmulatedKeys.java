package com.waveshare.mock;

import java.util.Optional;

import com.waveshare.keyboard.HatKeyboard;
import com.waveshare.keyboard.Keys;
import com.waveshare.keyboard.listener.KeyInputListener;

public class EmulatedKeys implements HatKeyboard {
	
	private KeyInputListener [] listeners = new KeyInputListener [Keys.values().length];

	@Override
	public void setListener(Keys key, KeyInputListener listener) {
		listeners[key.ordinal()] = listener;
	}

	@Override
	public void removeListener(Keys key) {
		setListener(key, null);
	}
	
	public Optional<KeyInputListener> getListener(Keys key) {
		return listeners[key.ordinal()] == null ? Optional.empty() : Optional.of(listeners[key.ordinal()]); 
	}

}
