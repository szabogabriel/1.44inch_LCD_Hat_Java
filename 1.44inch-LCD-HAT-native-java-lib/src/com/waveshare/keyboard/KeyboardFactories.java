package com.waveshare.keyboard;

public enum KeyboardFactories implements KeyboardFactory {
	
	HARDWARE {
		@Override
		public Keyboard createKeyboard() {
			return new HatKeys();
		}
	},
	;

}
