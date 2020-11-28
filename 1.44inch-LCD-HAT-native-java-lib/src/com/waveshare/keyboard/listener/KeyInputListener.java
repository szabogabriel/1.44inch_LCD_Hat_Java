package com.waveshare.keyboard.listener;

import com.waveshare.keyboard.HatKey;

public interface KeyInputListener {
	
	void keyPressed(HatKey key);
	void keyReleased(HatKey key);

}
