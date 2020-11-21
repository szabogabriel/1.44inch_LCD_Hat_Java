package com.waveshare.display;

import java.io.IOException;

import com.waveshare.display.buffered.BufferedLcdDisplay;
import com.waveshare.display.direct.DirectLcdDisplay;

public enum LcdFactory {

	BUFFERED {
		@Override
		public LcdDisplay createDisplay() {
			try {
				return new BufferedLcdDisplay();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	},
	DIRECT {
		@Override
		public LcdDisplay createDisplay() {
			try {
				return new DirectLcdDisplay();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
	},
	EMULATED {
		@Override
		public LcdDisplay createDisplay() {
			return null;
		}
	},
	;
	
	public abstract LcdDisplay createDisplay();

}
