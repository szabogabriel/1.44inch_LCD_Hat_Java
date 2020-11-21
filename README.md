# 1.44inch_LCD_Hat_Java

This project is the Java implementation of a LCD driver for the Waveshare 1.44inch LCD display (https://www.waveshare.com/product/raspberry-pi/displays/lcd-oled/1.44inch-lcd-hat.htm?___SID=U)

The initial source code development was inspired by the provided C libraries, traces of which can still be found in the source code (mainly in the LCD init and LCD setup phases).

## Description

The library consists of two main parts: Keyboard and LCD. The two components are coupled together in the Hat class.

### Keyboard
The Keyboard provides a fairly simple API for handling key events. The LCD display implementation has two main approaches: direct and buffered, both of wich uses a common LCD driver.

### LCD
The LCD driver implementation is basically a port of the Waveshare C libraries with some minor tweaks. Since it kinda flows the logic of the ST7735S chip (used in the display itself), it is pretty tedious to work with. Hence the abstraction layers in the form of the LCD display classes.

The direct LCD display is still based on the Waveshare C libraries. It makes an effort to provide basic draw functionalities, but the performance isn't that great. Probably most of the performance traits come from the general Java VM low level performance (JNI calls and I/O) - or the lack of it.

The buffered LCD display implementation still uses the LCD driver mentioned earlier, but uses an inner buffer (or more precisely a queue) which is processed in a separate thread. An additional, `commit` method has to be called, to send commit the buffer into the processing queue. Multi buffering is possible, and drawing the GUI isn't affected by the performance trait of the JVM when sending the data to the LCD display via SPI. Internally, the Java 2D API is used to handle the drawing, so additional advanced functionality could be added easily without changing the current implementation too much. The buffered LCD display also provides a method to switch the data sender (which encapsulates all the GPIO/SPI parts), thus enabling a redirect of the data flow and offering a possibility for mocking the display.

## Mock

The mock library is a small Java Swing application which emulates the keyboard and also the display. It isn't fancy, and uses the default Swing look and feel, but it serves its purpous.

It uses the buffered LCD display to draw everything on the screen. This means, that development, test and debugging of applications for the LCD hat can be done in any environment and any OS (where Java is available), without the necessity of using the display itself. This is made sure on one side by the switchable data sender, which redirects every GUI draw command to the Swing application's canvas and by emulating the key presses via the displayed buttons.

Using the emulator smiply using its Main class to obtain a Hat instance (the same kind you would want to create yourself for the real LCD and keyboard HAT).

## Performance and other details

When testing, the buffered LCD display was able to redraw the whole screen in 20-30ms. Most of the time is lost when converting the BufferedImage instance to a byte array. When testing the buffered LCD display in an earlier version, where the buffer was stored as byte arrays, a full LCD update was performed in 1ms. However, by using the BufferedImage as a buffer we can use the full blown Java 2D API to draw on the display, and still be able to get an update rate of around 30FPS.

The curent implemnetation of the buffered LCD display uses a fixed size synchronized queue to store the buffer. Its size is currently set to 1, thus making the whole system double buffered instead of a multi buffering. Changing the buffer size can be done directly in the code. One buffer is around the size of 64kB. 

## Dependencies

The only direct dependency is the Pi4j library. This however requires Wiringpi to be installed and set up. Pi4j isn't really required to be able to develop locally, but it is still necessary to get the code compiled.

## Setting up the Raspberry PI

The implementation was tested with Raspberry PI Zero W, with Raspbian GNU/Linux 10 (buster). 

Wiringpi was installed manually in the version of 2.50 (check via `gpio -v`). If not present, try installing via `sudo apt install wiringpi`, or look up further possibilities in here: http://wiringpi.com/download-and-install/. **WARNING** Wiringpi was ommited, but the current version is still working.

SPI has to enabled via `sudo raspi-config`. Additional config was necessary in the `/boot/config.txt` file. I had to add `dtoverlay=spi0-1cs # 1 chip select`, enables only one chip for the SPI. More information can be found here: https://www.raspberrypi.org/documentation/hardware/raspberrypi/spi/README.md.

The library was tested with Open JDK 1.8.0_212 (1.8.0_212-8u212-b01-1+rpi1-b01).

PI4J was used to simplify GPIO and SPI communication, installed via `curl -sSL https://pi4j.com/install | sudo bash`. More details can be found here: https://pi4j.com/1.2/install.html.

## Setting up the development environment

The project was created as an Eclipse project with a small Ant buildfile. The only necessary libraries besides the JDK were the PI4J. Setting up the dev environment should basically consist of importing the project into the IDE.
