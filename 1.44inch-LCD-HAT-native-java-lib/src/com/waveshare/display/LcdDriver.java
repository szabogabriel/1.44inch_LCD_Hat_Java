package com.waveshare.display;

import java.awt.Color;
import java.io.IOException;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.spi.SpiChannel;
import com.pi4j.io.spi.SpiDevice;
import com.pi4j.io.spi.SpiFactory;
import com.pi4j.io.spi.SpiMode;
import com.waveshare.display.direct.enums.ScanDirection;
import com.waveshare.display.util.ColorUtil;

public class LcdDriver {
	
	private static final int SPI_SPEED = 40000000;
	
	protected final DisplayDetails DISPLAY;
	
	private enum Pins {
		BACKLIGHT("Backlight", RaspiPin.GPIO_05, PinState.HIGH),
		DATA_COMMAND_SELECT("DataCommandSelect", RaspiPin.GPIO_06, PinState.LOW),
		RESET("Reset", RaspiPin.GPIO_02, PinState.HIGH),
		;
		
		private final String name;
		private final Pin pinNumber;
		private final PinState state;
		private GpioPinDigitalOutput pin = null;
		
		private Pins(String name, Pin pinNumber, PinState state) {
			this.name = name;
			this.pinNumber = pinNumber;
			this.state = state;
		}
	}
	
	protected SpiDevice spiDevice;
	
	public LcdDriver(GpioController gpio) throws IOException {
		this(gpio, new DisplayDetails(), ScanDirection.U2D_R2L);
	}
	
	public LcdDriver(GpioController gpio, DisplayDetails display, ScanDirection scanDirection) throws IOException {
		this.DISPLAY = display;
		for (Pins it : Pins.values()) {
			it.pin = gpio.provisionDigitalOutputPin(it.pinNumber, it.name, it.state);
		}
		
		spiDevice = SpiFactory.getInstance(SpiChannel.CS0, SPI_SPEED, SpiMode.MODE_0);
		
		turnOnBlacklight();
		
		reset();
		
		initRegisters();
		
		setupScanDirectionAndColorMode(scanDirection);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		writeRegister((byte)0x11);
		try {
			Thread.sleep(120);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		writeRegister((byte)0x29);
	}
	
	private void reset() {
		try {
			Pins.RESET.pin.high();
			Thread.sleep(100);
			Pins.RESET.pin.low();
			Thread.sleep(100);
			Pins.RESET.pin.high();
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void initRegisters() throws IOException {
		//ST7735R Frame Rate
		writeRegister((byte)0xB1);
		writeData((byte)0x01, (byte)0x2C, (byte)0x2D);

		writeRegister((byte)0xB2);
		writeData((byte)0x01, (byte)0x2C, (byte)0x2D);

		writeRegister((byte)0xB3);
		writeData((byte)0x01, (byte)0x2C, (byte)0x2D, (byte)0x01, (byte)0x2C, (byte)0x2D);
		
		//Column inversion 
		writeRegister((byte)0xB4);
		writeData((byte)0x07);
		
		//ST7735R Power Sequence
		writeRegister((byte)0xC0);
		writeData((byte)0xA2, (byte)0x02, (byte)0x84);
		
		writeRegister((byte)0xC1);
		writeData((byte)0xC5);

		writeRegister((byte)0xC2);
		writeData((byte)0x0A, (byte)0x00);

		writeRegister((byte)0xC3);
		writeData((byte)0x8A, (byte)0x2A);
		writeRegister((byte)0xC4);
		writeData((byte)0x8A, (byte)0xEE);
		
		writeRegister((byte)0xC5);//VCOM 
		writeData((byte)0x0E);
		
		//ST7735R Gamma Sequence
		writeRegister((byte)0xE0);
		writeData((byte)0x0f, (byte)0x1a, (byte)0x0f, (byte)0x18, (byte)0x2f, (byte)0x28, (byte)0x20, (byte)0x22,
				(byte)0x1f, (byte)0x1b, (byte)0x23, (byte)0x37, (byte)0x00, (byte)0x07, (byte)0x02, (byte)0x10);

		writeRegister((byte)0xe1);
		writeData((byte)0x0f, (byte)0x1b, (byte)0x0f, (byte)0x17, (byte)0x33, (byte)0x2c, (byte)0x29, (byte)0x2e,
				(byte)0x30, (byte)0x30, (byte)0x39, (byte)0x3f, (byte)0x00, (byte)0x07, (byte)0x03, (byte)0x10); 
		
		//Enable test command
		writeRegister((byte)0xF0);
		writeData((byte)0x01);
		
		//Disable ram power save mode
		writeRegister((byte)0xF6);
		writeData((byte)0x00);
		
		//65k mode
		writeRegister((byte)0x3A);
		writeData((byte)0x05);
	}
	
	private void setupScanDirectionAndColorMode(ScanDirection scanDirection) throws IOException {
	    //Get GRAM and LCD width and height
	    if(scanDirection == ScanDirection.L2R_U2D || scanDirection == ScanDirection.L2R_D2U || scanDirection == ScanDirection.R2L_U2D || scanDirection == ScanDirection.R2L_D2U) {
	    	DISPLAY.lcdDisplayColumn = DISPLAY.HEIGHT;
	    	DISPLAY.lcdDisplayPage = DISPLAY.WIDTH;
	    } else {
	    	DISPLAY.lcdDisplayPage = DISPLAY.HEIGHT;
	    	DISPLAY.lcdDisplayColumn = DISPLAY.WIDTH;
	    }

	    // Gets the scan direction of GRAM
	    int memoryAccessRegisterData = 0;  //0x36
	    switch (scanDirection) {
	    case L2R_U2D:
	    	memoryAccessRegisterData = 0X00 | 0x00;//x Scan direction | y Scan direction
	        break;
	    case L2R_D2U:
	    	memoryAccessRegisterData = 0x00 | 0x80;//0xC8 | 0X10
	        break;
	    case R2L_U2D://	0X4
	    	memoryAccessRegisterData = 0x40 | 0x00;
	        break;
	    case R2L_D2U://	0XC
	    	memoryAccessRegisterData = 0x40 | 0x80;
	        break;
	    case U2D_L2R://0X2
	    	memoryAccessRegisterData = 0X00 | 0X00 | 0x20;
	        break;
	    case U2D_R2L://0X6
	    	memoryAccessRegisterData = 0x00 | 0X40 | 0x20;
	        break;
	    case D2U_L2R://0XA
	    	memoryAccessRegisterData = 0x80 | 0x00 | 0x20;
	        break;
	    case D2U_R2L://0XE
	    	memoryAccessRegisterData = 0x40 | 0x80 | 0x20;
	        break;
	    }
		
		//please set (MemoryAccessReg_Data & 0x10) != 1
		if ((memoryAccessRegisterData & 0x20) != 1) {
			DISPLAY.lcdXAdjust = DISPLAY.LCD_Y;
			DISPLAY.lcdYAdjust = DISPLAY.LCD_X;
		} else {
			DISPLAY.lcdXAdjust = DISPLAY.LCD_X;
			DISPLAY.lcdYAdjust = DISPLAY.LCD_Y;
		}
		
		//Set the read / write scan direction of the frame memory
		writeRegister((byte)0x36); // MX, MY, RGB mode 
//		if LCD_1IN44 == 1:
		writeData((byte)((memoryAccessRegisterData | 0x08) & 0xFF)); //0x08 set RGB
//		else:
//			self.LCD_WriteData_8bit( MemoryAccessReg_Data & 0xf7)	#RGB color filter panel
	}
	
	private void writeRegister(byte data) throws IOException {
		Pins.DATA_COMMAND_SELECT.pin.low();
		spiDevice.write(data);
		Pins.DATA_COMMAND_SELECT.pin.high();
	}
	
	public void writeData(short ... data) throws IOException {
		writeData(toByteArray(data));
	}
	
	public void writeData(byte ... data) throws IOException {
		spiDevice.write(data);
	}
	
	protected byte[] toByteArray(short ... data) {
		byte[] ret = new byte[data.length * 2];
		for (int i = 0; i < data.length; i++) {
			ret[2 * i] = (byte)(data[i] >> 8);
			ret[(2 * i) + 1] = (byte)(data[i] & 0xFF);
		}
		return ret;
	}
	
	public void setWindows(int startX, int startY, int endX, int endY) throws IOException {
		//set the X coordinates
		writeRegister((byte)0x2A);
		writeData(	(byte)0x00,
					(byte)((startX & 0xff) + DISPLAY.lcdXAdjust),
					(byte)0x00,
					(byte)(((endX - 1) & 0xff) + DISPLAY.lcdXAdjust));

		//set the Y coordinates
		writeRegister((byte)0x2B);
		writeData(	(byte)0x00,
					(byte)((startY & 0xff) + DISPLAY.lcdYAdjust),
					(byte)0x00,
					(byte)(((endY - 1) & 0xff )+ DISPLAY.lcdYAdjust));

		writeRegister((byte)0x2C);
	}
	
	private void setCursor(int x, int y) throws IOException {
		setWindows(x, y, x, y);
	}
	
	private void setColor(Color color, int x, int y) throws IOException {
		int size = Math.abs(x * y);
		byte[] convertedColor = toByteArray((short)(ColorUtil.convertRgb888To565(color.getRGB())));
		byte[] data = new byte[size * 2];
		for (int i = 0; i < size; i++) {
			data[i * 2] = convertedColor[0];
			data[(i * 2) + 1] = convertedColor[1];
		}
		
		int chunk = 0;
		byte [] buffer = new byte[SpiDevice.MAX_SUPPORTED_BYTES];
		while (chunk + SpiDevice.MAX_SUPPORTED_BYTES < data.length) {
			System.arraycopy(data, chunk, buffer, 0, SpiDevice.MAX_SUPPORTED_BYTES);
			writeData(buffer);
			chunk += SpiDevice.MAX_SUPPORTED_BYTES;
		}
		buffer = new byte[data.length - chunk];
		System.arraycopy(data, chunk, buffer, 0, buffer.length);
		writeData(buffer);
	}
	
	public void setPointColor(Color color, int x, int y) throws IOException {
		if ((x <= DISPLAY.lcdDisplayColumn) && (y <= DISPLAY.lcdDisplayPage)) {
			setCursor(x, y);
			setColor(color, 1, 1);
		}
	}
	
	public void setAreaColor(Color color, int startX, int startY, int endX, int endY) throws IOException {
		if ((endX > startX) && (endY > startY)) {
			setWindows(startX, startY, endX, endY);
			setColor(color, endX - startX, endY - startY);
		}
	}
	
	public void clear(Color color) throws IOException {
		setAreaColor(color, 0, 0, DISPLAY.lcdDisplayColumn, DISPLAY.lcdDisplayPage);
	}
	
	public void turnOnBlacklight() {
		Pins.BACKLIGHT.pin.high();
	}
	
	public void flipBacklight() {
		Pins.BACKLIGHT.pin.toggle();
	}
	
}
