package com.waveshare.display.font;

public class Font8 implements Font {

	private byte[] data = new byte[] {
			// @0 ' ' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @8 '!' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @16 '"' (5 pixels wide)
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @24 '#' (5 pixels wide)
			(byte)0x28, // # #
			(byte)0x50, // # #
			(byte)0xF8, // #####
			(byte)0x50, // # #
			(byte)0xF8, // #####
			(byte)0x50, // # #
			(byte)0xA0, // # #
			(byte)0x00, //

			// @32 '$' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x30, // ##
			(byte)0x60, // ##
			(byte)0x30, // ##
			(byte)0x10, // #
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x00, //

			// @40 '%' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x18, // ##
			(byte)0x60, // ##
			(byte)0x10, // #
			(byte)0x10, // #
			(byte)0x00, //
			(byte)0x00, //

			// @48 '&' (5 pixels wide)
			(byte)0x00, //
			(byte)0x38, // ###
			(byte)0x20, // #
			(byte)0x60, // ##
			(byte)0x50, // # #
			(byte)0x78, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @56 ''' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @64 '(' (5 pixels wide)
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x00, //

			// @72 ')' (5 pixels wide)
			(byte)0x40, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x40, // #
			(byte)0x00, //

			// @80 '*' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @88 '+' (5 pixels wide)
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0xF8, // #####
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @96 ',' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //

			// @104 '-' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @112 '.' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @120 '/' (5 pixels wide)
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x80, // #
			(byte)0x00, //

			// @128 '0' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @136 '1' (5 pixels wide)
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0xF8, // #####
			(byte)0x00, //
			(byte)0x00, //

			// @144 '2' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x40, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @152 '3' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x60, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @160 '4' (5 pixels wide)
			(byte)0x10, // #
			(byte)0x30, // ##
			(byte)0x50, // # #
			(byte)0x78, // ####
			(byte)0x10, // #
			(byte)0x38, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @168 '5' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0x60, // ##
			(byte)0x10, // #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @176 '6' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x40, // #
			(byte)0x60, // ##
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x60, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @184 '7' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x50, // # #
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @192 '8' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @200 '9' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x30, // ##
			(byte)0x10, // #
			(byte)0x60, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @208 ':' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @216 ';' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x10, // #
			(byte)0x00, //
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @224 '<' (5 pixels wide)
			(byte)0x00, //
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0xC0, // ##
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x00, //
			(byte)0x00, //

			// @232 '=' (5 pixels wide)
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @240 '>' (5 pixels wide)
			(byte)0x00, //
			(byte)0x40, // #
			(byte)0x20, // #
			(byte)0x18, // ##
			(byte)0x20, // #
			(byte)0x40, // #
			(byte)0x00, //
			(byte)0x00, //

			// @248 '?' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @256 '@' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x58, // # ##
			(byte)0x48, // # #
			(byte)0x40, // #
			(byte)0x38, // ###
			(byte)0x00, //

			// @264 'A' (5 pixels wide)
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x70, // ###
			(byte)0x88, // # #
			(byte)0xD8, // ## ##
			(byte)0x00, //
			(byte)0x00, //

			// @272 'B' (5 pixels wide)
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x70, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xF0, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @280 'C' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x50, // # #
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @288 'D' (5 pixels wide)
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xF0, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @296 'E' (5 pixels wide)
			(byte)0xF8, // #####
			(byte)0x48, // # #
			(byte)0x60, // ##
			(byte)0x40, // #
			(byte)0x48, // # #
			(byte)0xF8, // #####
			(byte)0x00, //
			(byte)0x00, //

			// @304 'F' (5 pixels wide)
			(byte)0xF8, // #####
			(byte)0x48, // # #
			(byte)0x60, // ##
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0xE0, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @312 'G' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x58, // # ##
			(byte)0x50, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @320 'H' (5 pixels wide)
			(byte)0xE8, // ### #
			(byte)0x48, // # #
			(byte)0x78, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xE8, // ### #
			(byte)0x00, //
			(byte)0x00, //

			// @328 'I' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @336 'J' (5 pixels wide)
			(byte)0x38, // ###
			(byte)0x10, // #
			(byte)0x10, // #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x00, //

			// @344 'K' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x50, // # #
			(byte)0x60, // ##
			(byte)0x70, // ###
			(byte)0x50, // # #
			(byte)0xD8, // ## ##
			(byte)0x00, //
			(byte)0x00, //

			// @352 'L' (5 pixels wide)
			(byte)0xE0, // ###
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x48, // # #
			(byte)0xF8, // #####
			(byte)0x00, //
			(byte)0x00, //

			// @360 'M' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0xD8, // ## ##
			(byte)0xD8, // ## ##
			(byte)0xA8, // # # #
			(byte)0x88, // # #
			(byte)0xD8, // ## ##
			(byte)0x00, //
			(byte)0x00, //

			// @368 'N' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x68, // ## #
			(byte)0x68, // ## #
			(byte)0x58, // # ##
			(byte)0x58, // # ##
			(byte)0xE8, // ### #
			(byte)0x00, //
			(byte)0x00, //

			// @376 'O' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @384 'P' (5 pixels wide)
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0xE0, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @392 'Q' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x18, // ##
			(byte)0x00, //

			// @400 'R' (5 pixels wide)
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x70, // ###
			(byte)0x48, // # #
			(byte)0xE8, // ### #
			(byte)0x00, //
			(byte)0x00, //

			// @408 'S' (5 pixels wide)
			(byte)0x70, // ###
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x50, // # #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @416 'T' (5 pixels wide)
			(byte)0xF8, // #####
			(byte)0xA8, // # # #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @424 'U' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @432 'V' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x88, // # #
			(byte)0x48, // # #
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @440 'W' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x88, // # #
			(byte)0xA8, // # # #
			(byte)0xA8, // # # #
			(byte)0xA8, // # # #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //

			// @448 'X' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0xD8, // ## ##
			(byte)0x00, //
			(byte)0x00, //

			// @456 'Y' (5 pixels wide)
			(byte)0xD8, // ## ##
			(byte)0x88, // # #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @464 'Z' (5 pixels wide)
			(byte)0x78, // ####
			(byte)0x48, // # #
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x48, // # #
			(byte)0x78, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @472 '[' (5 pixels wide)
			(byte)0x30, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x30, // ##
			(byte)0x00, //

			// @480 '\' (5 pixels wide)
			(byte)0x80, // #
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x00, //

			// @488 ']' (5 pixels wide)
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x60, // ##
			(byte)0x00, //

			// @496 '^' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @504 '_' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xF8, // #####

			// @512 '`' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //

			// @520 'a' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x30, // ##
			(byte)0x10, // #
			(byte)0x70, // ###
			(byte)0x78, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @528 'b' (5 pixels wide)
			(byte)0xC0, // ##
			(byte)0x40, // #
			(byte)0x70, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xF0, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @536 'c' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0x40, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @544 'd' (5 pixels wide)
			(byte)0x18, // ##
			(byte)0x08, // #
			(byte)0x38, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x38, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @552 'e' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @560 'f' (5 pixels wide)
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @568 'g' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x38, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x38, // ###
			(byte)0x08, // #
			(byte)0x30, // ##

			// @576 'h' (5 pixels wide)
			(byte)0xC0, // ##
			(byte)0x40, // #
			(byte)0x70, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xE8, // ### #
			(byte)0x00, //
			(byte)0x00, //

			// @584 'i' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @592 'j' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x00, //
			(byte)0x70, // ###
			(byte)0x10, // #
			(byte)0x10, // #
			(byte)0x10, // #
			(byte)0x10, // #
			(byte)0x70, // ###

			// @600 'k' (5 pixels wide)
			(byte)0xC0, // ##
			(byte)0x40, // #
			(byte)0x58, // # ##
			(byte)0x70, // ###
			(byte)0x50, // # #
			(byte)0xD8, // ## ##
			(byte)0x00, //
			(byte)0x00, //

			// @608 'l' (5 pixels wide)
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @616 'm' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xD0, // ## #
			(byte)0xA8, // # # #
			(byte)0xA8, // # # #
			(byte)0xA8, // # # #
			(byte)0x00, //
			(byte)0x00, //

			// @624 'n' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0xC8, // ## #
			(byte)0x00, //
			(byte)0x00, //

			// @632 'o' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x30, // ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @640 'p' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xF0, // ####
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x70, // ###
			(byte)0x40, // #
			(byte)0xE0, // ###

			// @648 'q' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x38, // ###
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x38, // ###
			(byte)0x08, // #
			(byte)0x18, // ##

			// @656 'r' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x78, // ####
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x70, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @664 's' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x30, // ##
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x60, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @672 't' (5 pixels wide)
			(byte)0x00, //
			(byte)0x40, // #
			(byte)0xF0, // ####
			(byte)0x40, // #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @680 'u' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xD8, // ## ##
			(byte)0x48, // # #
			(byte)0x48, // # #
			(byte)0x38, // ###
			(byte)0x00, //
			(byte)0x00, //

			// @688 'v' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xC8, // ## #
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x30, // ##
			(byte)0x00, //
			(byte)0x00, //

			// @696 'w' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xD8, // ## ##
			(byte)0xA8, // # # #
			(byte)0xA8, // # # #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //

			// @704 'x' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x48, // # #
			(byte)0x30, // ##
			(byte)0x30, // ##
			(byte)0x48, // # #
			(byte)0x00, //
			(byte)0x00, //

			// @712 'y' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0xD8, // ## ##
			(byte)0x50, // # #
			(byte)0x50, // # #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x60, // ##

			// @720 'z' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x78, // ####
			(byte)0x50, // # #
			(byte)0x28, // # #
			(byte)0x78, // ####
			(byte)0x00, //
			(byte)0x00, //

			// @728 '{' (5 pixels wide)
			(byte)0x10, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x60, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x10, // #
			(byte)0x00, //

			// @736 '|' (5 pixels wide)
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x00, //

			// @744 '}' (5 pixels wide)
			(byte)0x40, // #
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x30, // ##
			(byte)0x20, // #
			(byte)0x20, // #
			(byte)0x40, // #
			(byte)0x00, //

			// @752 '~' (5 pixels wide)
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x28, // # #
			(byte)0x50, // # #
			(byte)0x00, //
			(byte)0x00, //
			(byte)0x00, //
	};

	@Override
	public byte[] getTable() {
		return data;
	}

	@Override
	public int getHeight() {
		return 8;
	}

	@Override
	public int getWidth() {
		return 5;
	}

}
