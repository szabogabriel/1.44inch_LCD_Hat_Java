package com.waveshare.keyboard;

import com.waveshare.keyboard.hat.HatKeyboardImpl;

public enum KeyboardFactories implements KeyboardFactory {
	
	HARDWARE {
		@Override
		public HatKeyboardImpl createKeyboard() {
			return new HatKeyboardImpl();
		}
	},
	;

}
