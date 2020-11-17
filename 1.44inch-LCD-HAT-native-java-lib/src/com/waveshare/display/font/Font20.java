package com.waveshare.display.font;

public class Font20 implements Font {
	
	private static final byte [] data = new byte [] {
			// @0 ' ' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @40 '!' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x02, (byte)0x00, //       #       
			(byte)0x02, (byte)0x00, //       #       
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @80 '"' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x08, (byte)0x40, //     #    #    
			(byte)0x08, (byte)0x40, //     #    #    
			(byte)0x08, (byte)0x40, //     #    #    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @120 '#' (14 pixels wide)
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @160 '$' (14 pixels wide)
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x07, (byte)0xE0, //      ######   
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @200 '%' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x1C, (byte)0x00, //    ###        
			(byte)0x22, (byte)0x00, //   #   #       
			(byte)0x22, (byte)0x00, //   #   #       
			(byte)0x22, (byte)0x00, //   #   #       
			(byte)0x1C, (byte)0x60, //    ###   ##   
			(byte)0x01, (byte)0xE0, //        ####   
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x3C, (byte)0x00, //   ####        
			(byte)0x31, (byte)0xC0, //   ##   ###    
			(byte)0x02, (byte)0x20, //       #   #   
			(byte)0x02, (byte)0x20, //       #   #   
			(byte)0x02, (byte)0x20, //       #   #   
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @240 '&' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0xE0, //       #####   
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0F, (byte)0x30, //     ####  ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x19, (byte)0xE0, //    ##  ####   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @280 ''' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x01, (byte)0x00, //        #      
			(byte)0x01, (byte)0x00, //        #      
			(byte)0x01, (byte)0x00, //        #      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @320 '(' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @360 ')' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @400 '*' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1B, (byte)0x60, //    ## ## ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @440 '+' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @480 ',' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x04, (byte)0x00, //      #        
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @520 '-' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @560 '.' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @600 '/' (14 pixels wide)
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @640 '0' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @680 '1' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @720 '2' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @760 '3' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x60, (byte)0xE0, //  ##     ###   
			(byte)0x7F, (byte)0xC0, //  #########    
			(byte)0x3F, (byte)0x80, //   #######     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @800 '4' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x06, (byte)0xC0, //      ## ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x30, (byte)0xC0, //   ##    ##    
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x03, (byte)0xE0, //       #####   
			(byte)0x03, (byte)0xE0, //       #####   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @840 '5' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @880 '6' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0xE0, //       #####   
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x37, (byte)0x80, //   ## ####     
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @920 '7' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @960 '8' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1000 '9' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x38, (byte)0xC0, //   ###   ##    
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x0F, (byte)0x60, //     #### ##   
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x3F, (byte)0x80, //   #######     
			(byte)0x3E, (byte)0x00, //   #####       
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1040 ':' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1080 ';' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x04, (byte)0x00, //      #        
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1120 '<' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0xF0, //         ####  
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x1C, (byte)0x00, //    ###        
			(byte)0x78, (byte)0x00, //  ####         
			(byte)0x1C, (byte)0x00, //    ###        
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x00, (byte)0xF0, //         ####  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1160 '=' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x7F, (byte)0xF0, //  ###########  
			(byte)0x7F, (byte)0xF0, //  ###########  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x7F, (byte)0xF0, //  ###########  
			(byte)0x7F, (byte)0xF0, //  ###########  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1200 '>' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x3C, (byte)0x00, //   ####        
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x00, (byte)0x78, //          #### 
			(byte)0x00, (byte)0xE0, //         ###   
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x3C, (byte)0x00, //   ####        
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1240 '?' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1280 '@' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x0C, (byte)0x80, //     ##  #     
			(byte)0x08, (byte)0x40, //     #    #    
			(byte)0x10, (byte)0x40, //    #     #    
			(byte)0x10, (byte)0x40, //    #     #    
			(byte)0x11, (byte)0xC0, //    #   ###    
			(byte)0x12, (byte)0x40, //    #  #  #    
			(byte)0x12, (byte)0x40, //    #  #  #    
			(byte)0x12, (byte)0x40, //    #  #  #    
			(byte)0x11, (byte)0xC0, //    #   ###    
			(byte)0x10, (byte)0x00, //    #          
			(byte)0x08, (byte)0x00, //     #         
			(byte)0x08, (byte)0x40, //     #    #    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1320 'A' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x06, (byte)0xC0, //      ## ##    
			(byte)0x06, (byte)0xC0, //      ## ##    
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x0C, (byte)0x60, //     ##   ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x78, (byte)0x78, //  ####    #### 
			(byte)0x78, (byte)0x78, //  ####    #### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1360 'B' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0x80, //   #######     
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1400 'C' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x0F, (byte)0xF0, //     ########  
			(byte)0x1C, (byte)0x70, //    ###   ###  
			(byte)0x38, (byte)0x30, //   ###     ##  
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x38, (byte)0x30, //   ###     ##  
			(byte)0x1C, (byte)0x70, //    ###   ###  
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1440 'D' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x7F, (byte)0x80, //  ########     
			(byte)0x7F, (byte)0xC0, //  #########    
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x30, (byte)0x70, //   ##     ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x70, //   ##     ###  
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x7F, (byte)0xC0, //  #########    
			(byte)0x7F, (byte)0x80, //  ########     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1480 'E' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1520 'F' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1560 'G' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x31, (byte)0xF8, //   ##   ###### 
			(byte)0x31, (byte)0xF8, //   ##   ###### 
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1600 'H' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1640 'I' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1680 'J' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0xF8, //       ####### 
			(byte)0x03, (byte)0xF8, //       ####### 
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1720 'K' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3E, (byte)0xF8, //   ##### ##### 
			(byte)0x3E, (byte)0xF8, //   ##### ##### 
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x1B, (byte)0x00, //    ## ##      
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x1D, (byte)0x80, //    ### ##     
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x3E, (byte)0x78, //   #####  #### 
			(byte)0x3E, (byte)0x38, //   #####   ### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1760 'L' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x30, //     ##    ##  
			(byte)0x0C, (byte)0x30, //     ##    ##  
			(byte)0x0C, (byte)0x30, //     ##    ##  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1800 'M' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0x78, //  ####    #### 
			(byte)0x78, (byte)0x78, //  ####    #### 
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x34, (byte)0xB0, //   ## #  # ##  
			(byte)0x37, (byte)0xB0, //   ## #### ##  
			(byte)0x37, (byte)0xB0, //   ## #### ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x7C, (byte)0xF8, //  #####  ##### 
			(byte)0x7C, (byte)0xF8, //  #####  ##### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1840 'N' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x39, (byte)0xF0, //   ###  #####  
			(byte)0x3D, (byte)0xF0, //   #### #####  
			(byte)0x1C, (byte)0x60, //    ###   ##   
			(byte)0x1E, (byte)0x60, //    ####  ##   
			(byte)0x1E, (byte)0x60, //    ####  ##   
			(byte)0x1B, (byte)0x60, //    ## ## ##   
			(byte)0x1B, (byte)0x60, //    ## ## ##   
			(byte)0x19, (byte)0xE0, //    ##  ####   
			(byte)0x19, (byte)0xE0, //    ##  ####   
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x3E, (byte)0xE0, //   ##### ###   
			(byte)0x3E, (byte)0x60, //   #####  ##   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1880 'O' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1920 'P' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @1960 'Q' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x0F, (byte)0xF0, //     ########  
			(byte)0x0C, (byte)0xE0, //     ##  ###   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2000 'R' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x3E, (byte)0x38, //   #####   ### 
			(byte)0x3E, (byte)0x18, //   #####    ## 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2040 'S' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0xB0, //     ##### ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x07, (byte)0xE0, //      ######   
			(byte)0x00, (byte)0x70, //          ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x37, (byte)0xC0, //   ## #####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2080 'T' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2120 'U' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1C, (byte)0xE0, //    ###  ###   
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2160 'V' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2200 'W' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x7C, (byte)0x7C, //  #####   #####
			(byte)0x7C, (byte)0x7C, //  #####   #####
			(byte)0x30, (byte)0x18, //   ##       ## 
			(byte)0x33, (byte)0x98, //   ##  ###  ## 
			(byte)0x33, (byte)0x98, //   ##  ###  ## 
			(byte)0x33, (byte)0x98, //   ##  ###  ## 
			(byte)0x36, (byte)0xD8, //   ## ## ## ## 
			(byte)0x16, (byte)0xD0, //    # ## ## #  
			(byte)0x1C, (byte)0x70, //    ###   ###  
			(byte)0x1C, (byte)0x70, //    ###   ###  
			(byte)0x1C, (byte)0x70, //    ###   ###  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2240 'X' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2280 'Y' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2320 'Z' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x60, //     ##   ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2360 '[' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2400 '\' (14 pixels wide)
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2440 ']' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x0F, (byte)0x00, //     ####      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2480 '^' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x02, (byte)0x00, //       #       
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x20, (byte)0x20, //   #       #   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2520 '_' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0xFF, (byte)0xFC, // ##############
			(byte)0xFF, (byte)0xFC, // ##############

			// @2560 '`' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x04, (byte)0x00, //      #        
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x80, //         #     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2600 'a' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x60, //          ##   
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x38, (byte)0x60, //   ###    ##   
			(byte)0x30, (byte)0xE0, //   ##    ###   
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x1F, (byte)0x70, //    ##### ###  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2640 'b' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x70, (byte)0x00, //  ###          
			(byte)0x70, (byte)0x00, //  ###          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x37, (byte)0x80, //   ## ####     
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x38, (byte)0x60, //   ###    ##   
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x60, //   ###    ##   
			(byte)0x7F, (byte)0xE0, //  ##########   
			(byte)0x77, (byte)0x80, //  ### ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2680 'c' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x38, (byte)0x30, //   ###     ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2720 'd' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x70, //          ###  
			(byte)0x00, (byte)0x70, //          ###  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x70, //   ###    ###  
			(byte)0x1F, (byte)0xF8, //    ########## 
			(byte)0x07, (byte)0xB8, //      #### ### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2760 'e' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x3F, (byte)0xF0, //   ##########  
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x18, (byte)0x30, //    ##     ##  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2800 'f' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0xF0, //       ######  
			(byte)0x07, (byte)0xF0, //      #######  
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2840 'g' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xB8, //      #### ### 
			(byte)0x1F, (byte)0xF8, //    ########## 
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0x70, //          ###  
			(byte)0x0F, (byte)0xE0, //     #######   
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2880 'h' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x1B, (byte)0xC0, //    ## ####    
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1C, (byte)0x60, //    ###   ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2920 'i' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @2960 'j' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x1F, (byte)0xC0, //    #######    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x00, (byte)0xC0, //         ##    
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x3F, (byte)0x80, //   #######     
			(byte)0x3F, (byte)0x00, //   ######      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3000 'k' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x38, (byte)0x00, //   ###         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x18, (byte)0x00, //    ##         
			(byte)0x1B, (byte)0xE0, //    ## #####   
			(byte)0x1B, (byte)0xE0, //    ## #####   
			(byte)0x1B, (byte)0x00, //    ## ##      
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x1B, (byte)0x00, //    ## ##      
			(byte)0x19, (byte)0x80, //    ##  ##     
			(byte)0x39, (byte)0xF0, //   ###  #####  
			(byte)0x39, (byte)0xF0, //   ###  #####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3040 'l' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x1F, (byte)0x00, //    #####      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3080 'm' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x7E, (byte)0xE0, //  ###### ###   
			(byte)0x7F, (byte)0xF0, //  ###########  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x33, (byte)0x30, //   ##  ##  ##  
			(byte)0x7B, (byte)0xB8, //  #### ### ### 
			(byte)0x7B, (byte)0xB8, //  #### ### ### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3120 'n' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3B, (byte)0xC0, //   ### ####    
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x1C, (byte)0x60, //    ###   ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3160 'o' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3200 'p' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x77, (byte)0x80, //  ### ####     
			(byte)0x7F, (byte)0xE0, //  ##########   
			(byte)0x38, (byte)0x60, //   ###    ##   
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x38, (byte)0x60, //   ###    ##   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x37, (byte)0x80, //   ## ####     
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x30, (byte)0x00, //   ##          
			(byte)0x7C, (byte)0x00, //  #####        
			(byte)0x7C, (byte)0x00, //  #####        
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3240 'q' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xB8, //      #### ### 
			(byte)0x1F, (byte)0xF8, //    ########## 
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x30, (byte)0x30, //   ##      ##  
			(byte)0x18, (byte)0x70, //    ##    ###  
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x07, (byte)0xB0, //      #### ##  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0x30, //           ##  
			(byte)0x00, (byte)0xF8, //         ##### 
			(byte)0x00, (byte)0xF8, //         ##### 
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3280 'r' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3C, (byte)0xE0, //   ####  ###   
			(byte)0x3D, (byte)0xF0, //   #### #####  
			(byte)0x0F, (byte)0x30, //     ####  ##  
			(byte)0x0E, (byte)0x00, //     ###       
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x3F, (byte)0xC0, //   ########    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3320 's' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x07, (byte)0xE0, //      ######   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x0F, (byte)0xC0, //     ######    
			(byte)0x01, (byte)0xE0, //        ####   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0x80, //    ######     
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3360 't' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x3F, (byte)0xE0, //   #########   
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x0C, (byte)0x30, //     ##    ##  
			(byte)0x0F, (byte)0xF0, //     ########  
			(byte)0x07, (byte)0xC0, //      #####    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3400 'u' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x38, (byte)0xE0, //   ###   ###   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0x60, //    ##    ##   
			(byte)0x18, (byte)0xE0, //    ##   ###   
			(byte)0x1F, (byte)0xF0, //    #########  
			(byte)0x0F, (byte)0x70, //     #### ###  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3440 'v' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3480 'w' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x32, (byte)0x60, //   ##  #  ##   
			(byte)0x32, (byte)0x60, //   ##  #  ##   
			(byte)0x37, (byte)0xE0, //   ## ######   
			(byte)0x1D, (byte)0xC0, //    ### ###    
			(byte)0x1D, (byte)0xC0, //    ### ###    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3520 'x' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x07, (byte)0x80, //      ####     
			(byte)0x0C, (byte)0xC0, //     ##  ##    
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x3C, (byte)0xF0, //   ####  ####  
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3560 'y' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x78, (byte)0xF0, //  ####   ####  
			(byte)0x30, (byte)0x60, //   ##     ##   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x0D, (byte)0x80, //     ## ##     
			(byte)0x0F, (byte)0x80, //     #####     
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x00, //     ##        
			(byte)0x7F, (byte)0x00, //  #######      
			(byte)0x7F, (byte)0x00, //  #######      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3600 'z' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x18, (byte)0xC0, //    ##   ##    
			(byte)0x01, (byte)0x80, //        ##     
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x0C, (byte)0x60, //     ##   ##   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x1F, (byte)0xE0, //    ########   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3640 '{' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x0E, (byte)0x00, //     ###       
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0xC0, //       ####    
			(byte)0x01, (byte)0xC0, //        ###    
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3680 '|' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x03, (byte)0x00, //       ##      
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3720 '}' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x1C, (byte)0x00, //    ###        
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x03, (byte)0x80, //       ###     
			(byte)0x07, (byte)0x00, //      ###      
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x06, (byte)0x00, //      ##       
			(byte)0x1E, (byte)0x00, //    ####       
			(byte)0x1C, (byte)0x00, //    ###        
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               

			// @3760 '~' (14 pixels wide)
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x0E, (byte)0x00, //     ###       
			(byte)0x3F, (byte)0x30, //   ######  ##  
			(byte)0x33, (byte)0xF0, //   ##  ######  
			(byte)0x01, (byte)0xE0, //        ####   
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //               
			(byte)0x00, (byte)0x00, //
	};

	@Override
	public byte[] getTable() {
		return data;
	}

	@Override
	public int getHeight() {
		return 20;
	}

	@Override
	public int getWidth() {
		return 14;
	}

}
