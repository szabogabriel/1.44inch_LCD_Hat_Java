package com.waveshare.mock;

import java.util.Optional;

import com.waveshare.keyboard.HatKeyboard;
import com.waveshare.keyboard.listener.KeyInputListener;

public class EmulatedKeys implements HatKeyboard {
	
	private KeyInputListener listeners = null;

	@Override
	public void setListener(KeyInputListener listener) {
		listeners = listener;
	}

	@Override
	public void removeListener() {
		setListener(null);
	}
	
	public Optional<KeyInputListener> getListener() {
		return Optional.ofNullable(listeners);
	}

}
