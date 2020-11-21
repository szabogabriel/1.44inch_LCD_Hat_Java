package com.waveshare.keyboard;

import com.waveshare.keyboard.hat.HatKeys;

public enum KeyboardFactories implements KeyboardFactory {
	
	HARDWARE {
		@Override
		public Keyboard createKeyboard() {
			return new HatKeys();
		}
	},
	;

}
