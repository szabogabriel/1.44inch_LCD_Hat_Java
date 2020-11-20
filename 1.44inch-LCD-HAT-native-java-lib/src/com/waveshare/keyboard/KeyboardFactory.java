package com.waveshare.keyboard;

public enum KeyboardFactory {
	
	EMULATED {
		@Override
		public Keyboard createKeyboard() {
			return new EmulatedKeys();
		}
	},
	HARDWARE {
		@Override
		public Keyboard createKeyboard() {
			return new HatKeys();
		}
	},
	;
	
	public abstract Keyboard createKeyboard();

}
