package com.waveshare.keyboard;

import com.waveshare.keyboard.listener.KeyInputListener;

public interface HatKeyboard {
	
	void setListener(KeyInputListener listener);
	
	void removeListener();

}
