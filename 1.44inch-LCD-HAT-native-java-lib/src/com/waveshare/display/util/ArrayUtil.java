package com.waveshare.display.util;

public class ArrayUtil {

	public static byte[] toByteArray(short ... data) {
		byte[] ret = new byte[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			ret[2 * i] = (byte)(data[i] >> 8);
			ret[(2 * i) + 1] = (byte)(data[i] & 0xFF);
		}
		return ret;
	}
}
