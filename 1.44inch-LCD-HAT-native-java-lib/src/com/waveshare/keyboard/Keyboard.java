package com.waveshare.keyboard;

import com.waveshare.keyboard.listener.KeyInputListener;

public interface Keyboard {
	
	void setListener(Keys key, KeyInputListener listener);
	
	void removeListener(Keys key);

}
