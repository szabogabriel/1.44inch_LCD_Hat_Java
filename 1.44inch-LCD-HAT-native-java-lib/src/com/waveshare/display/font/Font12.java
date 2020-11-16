package com.waveshare.display.font;

public class Font12 implements Font {

	private byte[] data = new byte[] {
			// @0 ' ' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @12 '!' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @24 '"' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x6C, // ## ##
			(byte) 0x48, // # #
			(byte) 0x48, // # #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @36 '#' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x14, // # #
			(byte) 0x14, // # #
			(byte) 0x28, // # #
			(byte) 0x7C, // #####
			(byte) 0x28, // # #
			(byte) 0x7C, // #####
			(byte) 0x28, // # #
			(byte) 0x50, // # #
			(byte) 0x50, // # #
			(byte) 0x00, //
			(byte) 0x00, //

			// @48 '$' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x38, // ###
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x38, // ###
			(byte) 0x48, // # #
			(byte) 0x70, // ###
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //

			// @60 '%' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x20, // #
			(byte) 0x50, // # #
			(byte) 0x20, // #
			(byte) 0x0C, // ##
			(byte) 0x70, // ###
			(byte) 0x08, // #
			(byte) 0x14, // # #
			(byte) 0x08, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @72 '&' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x18, // ##
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x54, // # # #
			(byte) 0x48, // # #
			(byte) 0x34, // ## #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @84 ''' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @96 '(' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x00, //

			// @108 ')' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x00, //

			// @120 '*' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x7C, // #####
			(byte) 0x10, // #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @132 '+' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0xFE, // #######
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @144 ',' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x18, // ##
			(byte) 0x10, // #
			(byte) 0x30, // ##
			(byte) 0x20, // #
			(byte) 0x00, //

			// @156 '-' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @168 '.' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x30, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @180 '/' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x04, // #
			(byte) 0x04, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x40, // #
			(byte) 0x00, //
			(byte) 0x00, //

			// @192 '0' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @204 '1' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @216 '2' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x04, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x44, // # #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @228 '3' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x04, // #
			(byte) 0x18, // ##
			(byte) 0x04, // #
			(byte) 0x04, // #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @240 '4' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x0C, // ##
			(byte) 0x14, // # #
			(byte) 0x14, // # #
			(byte) 0x24, // # #
			(byte) 0x44, // # #
			(byte) 0x7E, // ######
			(byte) 0x04, // #
			(byte) 0x0E, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @252 '5' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x38, // ###
			(byte) 0x04, // #
			(byte) 0x04, // #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @264 '6' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x1C, // ###
			(byte) 0x20, // #
			(byte) 0x40, // #
			(byte) 0x78, // ####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @276 '7' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x44, // # #
			(byte) 0x04, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @288 '8' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @300 '9' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x3C, // ####
			(byte) 0x04, // #
			(byte) 0x08, // #
			(byte) 0x70, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @312 ':' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x30, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x30, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @324 ';' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x18, // ##
			(byte) 0x18, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x18, // ##
			(byte) 0x30, // ##
			(byte) 0x20, // #
			(byte) 0x00, //
			(byte) 0x00, //

			// @336 '<' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x0C, // ##
			(byte) 0x10, // #
			(byte) 0x60, // ##
			(byte) 0x80, // #
			(byte) 0x60, // ##
			(byte) 0x10, // #
			(byte) 0x0C, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @348 '=' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @360 '>' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xC0, // ##
			(byte) 0x20, // #
			(byte) 0x18, // ##
			(byte) 0x04, // #
			(byte) 0x18, // ##
			(byte) 0x20, // #
			(byte) 0xC0, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @372 '?' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x18, // ##
			(byte) 0x24, // # #
			(byte) 0x04, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @384 '@' (7 pixels wide)
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x4C, // # ##
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x4C, // # ##
			(byte) 0x40, // #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //

			// @396 'A' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x10, // #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x7C, // #####
			(byte) 0x44, // # #
			(byte) 0xEE, // ### ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @408 'B' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xF8, // #####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x78, // ####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xF8, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @420 'C' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x44, // # #
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @432 'D' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xF0, // ####
			(byte) 0x48, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x48, // # #
			(byte) 0xF0, // ####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @444 'E' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xFC, // ######
			(byte) 0x44, // # #
			(byte) 0x50, // # #
			(byte) 0x70, // ###
			(byte) 0x50, // # #
			(byte) 0x40, // #
			(byte) 0x44, // # #
			(byte) 0xFC, // ######
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @456 'F' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x7E, // ######
			(byte) 0x22, // # #
			(byte) 0x28, // # #
			(byte) 0x38, // ###
			(byte) 0x28, // # #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x70, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @468 'G' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x44, // # #
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x4E, // # ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @480 'H' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x7C, // #####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xEE, // ### ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @492 'I' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @504 'J' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x48, // # #
			(byte) 0x48, // # #
			(byte) 0x48, // # #
			(byte) 0x30, // ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @516 'K' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x48, // # #
			(byte) 0x50, // # #
			(byte) 0x70, // ###
			(byte) 0x48, // # #
			(byte) 0x44, // # #
			(byte) 0xE6, // ### ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @528 'L' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x70, // ###
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x24, // # #
			(byte) 0x24, // # #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @540 'M' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x6C, // ## ##
			(byte) 0x6C, // ## ##
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xEE, // ### ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @552 'N' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x64, // ## #
			(byte) 0x64, // ## #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x4C, // # ##
			(byte) 0xEC, // ### ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @564 'O' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @576 'P' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x78, // ####
			(byte) 0x24, // # #
			(byte) 0x24, // # #
			(byte) 0x24, // # #
			(byte) 0x38, // ###
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x70, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @588 'Q' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x1C, // ###
			(byte) 0x00, //
			(byte) 0x00, //

			// @600 'R' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xF8, // #####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x78, // ####
			(byte) 0x48, // # #
			(byte) 0x44, // # #
			(byte) 0xE2, // ### #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @612 'S' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x34, // ## #
			(byte) 0x4C, // # ##
			(byte) 0x40, // #
			(byte) 0x38, // ###
			(byte) 0x04, // #
			(byte) 0x04, // #
			(byte) 0x64, // ## #
			(byte) 0x58, // # ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @624 'T' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xFE, // #######
			(byte) 0x92, // # # #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @636 'U' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @648 'V' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @660 'W' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x28, // # #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @672 'X' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xC6, // ## ##
			(byte) 0x44, // # #
			(byte) 0x28, // # #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x28, // # #
			(byte) 0x44, // # #
			(byte) 0xC6, // ## ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @684 'Y' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @696 'Z' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x44, // # #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x44, // # #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @708 '[' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x38, // ###
			(byte) 0x00, //

			// @720 '\' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x40, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x00, //
			(byte) 0x00, //

			// @732 ']' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x38, // ###
			(byte) 0x00, //

			// @744 '^' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x28, // # #
			(byte) 0x44, // # #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @756 '_' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xFE, // #######

			// @768 '`' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x08, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @780 'a' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x3C, // ####
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x3E, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @792 'b' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xC0, // ##
			(byte) 0x40, // #
			(byte) 0x58, // # ##
			(byte) 0x64, // ## #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xF8, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @804 'c' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x44, // # #
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @816 'd' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x0C, // ##
			(byte) 0x04, // #
			(byte) 0x34, // ## #
			(byte) 0x4C, // # ##
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x3E, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @828 'e' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x7C, // #####
			(byte) 0x40, // #
			(byte) 0x40, // #
			(byte) 0x3C, // ####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @840 'f' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x1C, // ###
			(byte) 0x20, // #
			(byte) 0x7C, // #####
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @852 'g' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x36, // ## ##
			(byte) 0x4C, // # ##
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x3C, // ####
			(byte) 0x04, // #
			(byte) 0x38, // ###
			(byte) 0x00, //

			// @864 'h' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xC0, // ##
			(byte) 0x40, // #
			(byte) 0x58, // # ##
			(byte) 0x64, // ## #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xEE, // ### ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @876 'i' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x70, // ###
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @888 'j' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x78, // ####
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x08, // #
			(byte) 0x70, // ###
			(byte) 0x00, //

			// @900 'k' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0xC0, // ##
			(byte) 0x40, // #
			(byte) 0x5C, // # ###
			(byte) 0x48, // # #
			(byte) 0x70, // ###
			(byte) 0x50, // # #
			(byte) 0x48, // # #
			(byte) 0xDC, // ## ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @912 'l' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x30, // ##
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @924 'm' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xE8, // ### #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0xFE, // #######
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @936 'n' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xD8, // ## ##
			(byte) 0x64, // ## #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0xEE, // ### ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @948 'o' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x38, // ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @960 'p' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xD8, // ## ##
			(byte) 0x64, // ## #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x78, // ####
			(byte) 0x40, // #
			(byte) 0xE0, // ###
			(byte) 0x00, //

			// @972 'q' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x36, // ## ##
			(byte) 0x4C, // # ##
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x3C, // ####
			(byte) 0x04, // #
			(byte) 0x0E, // ###
			(byte) 0x00, //

			// @984 'r' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x6C, // ## ##
			(byte) 0x30, // ##
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @996 's' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x3C, // ####
			(byte) 0x44, // # #
			(byte) 0x38, // ###
			(byte) 0x04, // #
			(byte) 0x44, // # #
			(byte) 0x78, // ####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1008 't' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x20, // #
			(byte) 0x7C, // #####
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x20, // #
			(byte) 0x22, // # #
			(byte) 0x1C, // ###
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1020 'u' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xCC, // ## ##
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x4C, // # ##
			(byte) 0x36, // ## ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1032 'v' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x44, // # #
			(byte) 0x28, // # #
			(byte) 0x28, // # #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1044 'w' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x54, // # # #
			(byte) 0x28, // # #
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1056 'x' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xCC, // ## ##
			(byte) 0x48, // # #
			(byte) 0x30, // ##
			(byte) 0x30, // ##
			(byte) 0x48, // # #
			(byte) 0xCC, // ## ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1068 'y' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0xEE, // ### ###
			(byte) 0x44, // # #
			(byte) 0x24, // # #
			(byte) 0x28, // # #
			(byte) 0x18, // ##
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x78, // ####
			(byte) 0x00, //

			// @1080 'z' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x7C, // #####
			(byte) 0x48, // # #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x44, // # #
			(byte) 0x7C, // #####
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //

			// @1092 '{' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x08, // #
			(byte) 0x00, //

			// @1104 '|' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x00, //
			(byte) 0x00, //

			// @1116 '}' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x20, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x08, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x10, // #
			(byte) 0x20, // #
			(byte) 0x00, //

			// @1128 '~' (7 pixels wide)
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x24, // # #
			(byte) 0x58, // # ##
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
			(byte) 0x00, //
	};

	@Override
	public byte[] getTable() {
		return data;
	}

	@Override
	public int getHeight() {
		return 12;
	}

	@Override
	public int getWidth() {
		return 7;
	}

}
