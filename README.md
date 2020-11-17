# 1.44inch_LCD_Hat_Java

This project is the Java implementation of the demo codes released as part of the Waveshare 1.44inch LCD display. More information on the device itself can be found here: https://www.waveshare.com/product/raspberry-pi/displays/lcd-oled/1.44inch-lcd-hat.htm?___SID=U

## Description

This port was born out of sheer convenience. It is **HEAVILY** inspired by the provided C and Python demo codes, and is missing some parts. Some minor optimalizations were performed, to speed up the serial communication with the LCD HAT. The project currently is in an early phase.

## Setting up the Raspberry PI

It was tested with Raspberry PI Zero W, with Raspbian GNU/Linux 10 (buster). 

Wiringpi was installed manually in the version of 2.50 (check via `gpio -v`). If not present, try installing via `sudo apt install wiringpi`, or look up further possibilities in here: http://wiringpi.com/download-and-install/. **WARNING** Wiringpi was ommited, but the current version is still working.

SPI has to enabled via `sudo raspi-config`. Additional config was necessary in the `/boot/config.txt` file. I had to add `dtoverlay=spi0-1cs # 1 chip select`, enables only one chip for the SPI. More information can be found here: https://www.raspberrypi.org/documentation/hardware/raspberrypi/spi/README.md.

The library was tested with Open JDK 1.8.0_212 (1.8.0_212-8u212-b01-1+rpi1-b01).

PI4J was used to simplify GPIO and SPI communication, installed via `curl -sSL https://pi4j.com/install | sudo bash`. More details can be found here: https://pi4j.com/1.2/install.html.

## Setting up the development environment

The project was created as an Eclipse project with a small Ant buildfile. The only necessary libraries besides the JDK were the PI4J. Setting up the dev environment should basically consist of importing the project into the IDE.
