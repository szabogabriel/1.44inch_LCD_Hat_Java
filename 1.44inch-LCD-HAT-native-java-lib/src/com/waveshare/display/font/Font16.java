package com.waveshare.display.font;

public class Font16 implements Font {

	private static final byte [] data = new byte [] {
			// @0 ' ' (11 pixels wide)
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

			// @32 '!' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @64 '"' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x08, (byte)0x80, //     #   #  
			(byte)0x08, (byte)0x80, //     #   #  
			(byte)0x08, (byte)0x80, //     #   #  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @96 '#' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0D, (byte)0x80, //     ## ##  
			(byte)0x0D, (byte)0x80, //     ## ##  
			(byte)0x0D, (byte)0x80, //     ## ##  
			(byte)0x0D, (byte)0x80, //     ## ##  
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @128 '$' (11 pixels wide)
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x38, (byte)0x00, //   ###      
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x03, (byte)0x80, //       ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @160 '%' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x24, (byte)0x00, //   #  #     
			(byte)0x24, (byte)0x00, //   #  #     
			(byte)0x18, (byte)0xC0, //    ##   ## 
			(byte)0x07, (byte)0x80, //      ####  
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x02, (byte)0x40, //       #  # 
			(byte)0x02, (byte)0x40, //       #  # 
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @192 '&' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x37, (byte)0x00, //   ## ###   
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @224 ''' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x02, (byte)0x00, //       #    
			(byte)0x02, (byte)0x00, //       #    
			(byte)0x02, (byte)0x00, //       #    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @256 '(' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @288 ')' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x1C, (byte)0x00, //    ###     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @320 '*' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @352 '+' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @384 ',' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x08, (byte)0x00, //     #      
			(byte)0x08, (byte)0x00, //     #      
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @416 '-' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @448 '.' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @480 '/' (11 pixels wide)
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @512 '0' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @544 '1' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @576 '2' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @608 '3' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x03, (byte)0x80, //       ###  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @640 '4' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x0B, (byte)0x00, //     # ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x13, (byte)0x00, //    #  ##   
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x0F, (byte)0x80, //     #####  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @672 '5' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x11, (byte)0x80, //    #   ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x21, (byte)0x80, //   #    ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @704 '6' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x07, (byte)0x80, //      ####  
			(byte)0x1C, (byte)0x00, //    ###     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x37, (byte)0x00, //   ## ###   
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @736 '7' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x43, (byte)0x00, //  #    ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @768 '8' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @800 '9' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x3C, (byte)0x00, //   ####     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @832 ':' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @864 ';' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x08, (byte)0x00, //     #      
			(byte)0x08, (byte)0x00, //     #      
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @896 '<' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @928 '=' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0xC0, //  ######### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0xC0, //  ######### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @960 '>' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @992 '?' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x07, (byte)0x00, //      ###   
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1024 '@' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x11, (byte)0x00, //    #   #   
			(byte)0x21, (byte)0x00, //   #    #   
			(byte)0x21, (byte)0x00, //   #    #   
			(byte)0x27, (byte)0x00, //   #  ###   
			(byte)0x29, (byte)0x00, //   # #  #   
			(byte)0x29, (byte)0x00, //   # #  #   
			(byte)0x27, (byte)0x00, //   #  ###   
			(byte)0x20, (byte)0x00, //   #        
			(byte)0x11, (byte)0x00, //    #   #   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1056 'A' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x09, (byte)0x00, //     #  #   
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x79, (byte)0xE0, //  ####  ####
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1088 'B' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1120 'C' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x40, //    ##### # 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x60, (byte)0x40, //  ##      # 
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x60, (byte)0x40, //  ##      # 
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1152 'D' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1184 'E' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x80, //  ########  
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x32, (byte)0x00, //   ##  #    
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x32, (byte)0x00, //   ##  #    
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x7F, (byte)0x80, //  ########  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1216 'F' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0xC0, //  ######### 
			(byte)0x30, (byte)0x40, //   ##     # 
			(byte)0x30, (byte)0x40, //   ##     # 
			(byte)0x32, (byte)0x00, //   ##  #    
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x32, (byte)0x00, //   ##  #    
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x7C, (byte)0x00, //  #####     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1248 'G' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x80, //    #### #  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0x80, //  ##     #  
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x67, (byte)0xC0, //  ##  ##### 
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1280 'H' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1312 'I' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1344 'J' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0xC0, //    ####### 
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x63, (byte)0x00, //  ##   ##   
			(byte)0x63, (byte)0x00, //  ##   ##   
			(byte)0x63, (byte)0x00, //  ##   ##   
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1376 'K' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x36, (byte)0x00, //   ## ##    
			(byte)0x3C, (byte)0x00, //   ####     
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x79, (byte)0xC0, //  ####  ### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1408 'L' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7E, (byte)0x00, //  ######    
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x40, //    ##    # 
			(byte)0x18, (byte)0x40, //    ##    # 
			(byte)0x18, (byte)0x40, //    ##    # 
			(byte)0x7F, (byte)0xC0, //  ######### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1440 'M' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0xE0, (byte)0xE0, // ###     ###
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x71, (byte)0xC0, //  ###   ### 
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x6A, (byte)0xC0, //  ## # # ## 
			(byte)0x6E, (byte)0xC0, //  ## ### ## 
			(byte)0x64, (byte)0xC0, //  ##  #  ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0xFB, (byte)0xE0, // ##### #####
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1472 'N' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x73, (byte)0xC0, //  ###  #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x3D, (byte)0x80, //   #### ##  
			(byte)0x35, (byte)0x80, //   ## # ##  
			(byte)0x37, (byte)0x80, //   ## ####  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x79, (byte)0x80, //  ####  ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1504 'O' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1536 'P' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x7E, (byte)0x00, //  ######    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1568 'Q' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x0C, (byte)0xC0, //     ##  ## 
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1600 'R' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7C, (byte)0xE0, //  #####  ###
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1632 'S' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x38, (byte)0x00, //   ###      
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x03, (byte)0x80, //       ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1664 'T' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x80, //  ########  
			(byte)0x4C, (byte)0x80, //  #  ##  #  
			(byte)0x4C, (byte)0x80, //  #  ##  #  
			(byte)0x4C, (byte)0x80, //  #  ##  #  
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1696 'U' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1728 'V' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x0A, (byte)0x00, //     # #    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1760 'W' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0xFB, (byte)0xE0, // ##### #####
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x64, (byte)0xC0, //  ##  #  ## 
			(byte)0x6E, (byte)0xC0, //  ## ### ## 
			(byte)0x6E, (byte)0xC0, //  ## ### ## 
			(byte)0x2A, (byte)0x80, //   # # # #  
			(byte)0x3B, (byte)0x80, //   ### ###  
			(byte)0x3B, (byte)0x80, //   ### ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1792 'X' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1824 'Y' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x79, (byte)0xE0, //  ####  ####
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1856 'Z' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x21, (byte)0x80, //   #    ##  
			(byte)0x23, (byte)0x00, //   #   ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x18, (byte)0x80, //    ##   #  
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1888 '[' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x07, (byte)0x80, //      ####  
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x07, (byte)0x80, //      ####  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1920 '\' (11 pixels wide)
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x00, (byte)0xC0, //         ## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1952 ']' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @1984 '^' (11 pixels wide)
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x0A, (byte)0x00, //     # #    
			(byte)0x0A, (byte)0x00, //     # #    
			(byte)0x11, (byte)0x00, //    #   #   
			(byte)0x20, (byte)0x80, //   #     #  
			(byte)0x20, (byte)0x80, //   #     #  
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

			// @2016 '_' (11 pixels wide)
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
			(byte)0xFF, (byte)0xE0, // ###########

			// @2048 '`' (11 pixels wide)
			(byte)0x08, (byte)0x00, //     #      
			(byte)0x04, (byte)0x00, //      #     
			(byte)0x02, (byte)0x00, //       #    
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

			// @2080 'a' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2112 'b' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x70, (byte)0x00, //  ###       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x37, (byte)0x00, //   ## ###   
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x77, (byte)0x00, //  ### ###   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2144 'c' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x80, //    #### #  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0x80, //  ##     #  
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x60, (byte)0x80, //  ##     #  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2176 'd' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x03, (byte)0x80, //       ###  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2208 'e' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x7F, (byte)0xC0, //  ######### 
			(byte)0x60, (byte)0x00, //  ##        
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2240 'f' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x07, (byte)0xE0, //      ######
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2272 'g' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2304 'h' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x70, (byte)0x00, //  ###       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x37, (byte)0x00, //   ## ###   
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2336 'i' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2368 'j' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2400 'k' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x70, (byte)0x00, //  ###       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x37, (byte)0x80, //   ## ####  
			(byte)0x36, (byte)0x00, //   ## ##    
			(byte)0x3C, (byte)0x00, //   ####     
			(byte)0x3C, (byte)0x00, //   ####     
			(byte)0x36, (byte)0x00, //   ## ##    
			(byte)0x33, (byte)0x00, //   ##  ##   
			(byte)0x77, (byte)0xC0, //  ### ##### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2432 'l' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x1E, (byte)0x00, //    ####    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x3F, (byte)0xC0, //   ######## 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2464 'm' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7F, (byte)0x80, //  ########  
			(byte)0x36, (byte)0xC0, //   ## ## ## 
			(byte)0x36, (byte)0xC0, //   ## ## ## 
			(byte)0x36, (byte)0xC0, //   ## ## ## 
			(byte)0x36, (byte)0xC0, //   ## ## ## 
			(byte)0x36, (byte)0xC0, //   ## ## ## 
			(byte)0x76, (byte)0xE0, //  ### ## ###
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2496 'n' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x77, (byte)0x00, //  ### ###   
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2528 'o' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2560 'p' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x77, (byte)0x00, //  ### ###   
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x39, (byte)0x80, //   ###  ##  
			(byte)0x37, (byte)0x00, //   ## ###   
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x30, (byte)0x00, //   ##       
			(byte)0x7C, (byte)0x00, //  #####     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2592 'q' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x61, (byte)0x80, //  ##    ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0x80, //    ### ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x01, (byte)0x80, //        ##  
			(byte)0x07, (byte)0xC0, //      ##### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2624 'r' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0x80, //  #### ###  
			(byte)0x1C, (byte)0xC0, //    ###  ## 
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2656 's' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x1F, (byte)0x80, //    ######  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3C, (byte)0x00, //   ####     
			(byte)0x1F, (byte)0x00, //    #####   
			(byte)0x03, (byte)0x80, //       ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x3F, (byte)0x00, //   ######   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2688 't' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x7F, (byte)0x00, //  #######   
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x18, (byte)0x80, //    ##   #  
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2720 'u' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x73, (byte)0x80, //  ###  ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x33, (byte)0x80, //   ##  ###  
			(byte)0x1D, (byte)0xC0, //    ### ### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2752 'v' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2784 'w' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0xF1, (byte)0xE0, // ####   ####
			(byte)0x60, (byte)0xC0, //  ##     ## 
			(byte)0x64, (byte)0xC0, //  ##  #  ## 
			(byte)0x6E, (byte)0xC0, //  ## ### ## 
			(byte)0x3B, (byte)0x80, //   ### ###  
			(byte)0x3B, (byte)0x80, //   ### ###  
			(byte)0x31, (byte)0x80, //   ##   ##  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2816 'x' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x1B, (byte)0x00, //    ## ##   
			(byte)0x7B, (byte)0xC0, //  #### #### 
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2848 'y' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x79, (byte)0xE0, //  ####  ####
			(byte)0x30, (byte)0xC0, //   ##    ## 
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x19, (byte)0x80, //    ##  ##  
			(byte)0x0B, (byte)0x00, //     # ##   
			(byte)0x0F, (byte)0x00, //     ####   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x3E, (byte)0x00, //   #####    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2880 'z' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x21, (byte)0x80, //   #    ##  
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x0E, (byte)0x00, //     ###    
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x30, (byte)0x80, //   ##    #  
			(byte)0x3F, (byte)0x80, //   #######  
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2912 '{' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2944 '|' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @2976 '}' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x03, (byte)0x00, //       ##   
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x06, (byte)0x00, //      ##    
			(byte)0x0C, (byte)0x00, //     ##     
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            

			// @3008 '~' (11 pixels wide)
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x00, (byte)0x00, //            
			(byte)0x18, (byte)0x00, //    ##      
			(byte)0x24, (byte)0x80, //   #  #  #  
			(byte)0x03, (byte)0x00, //       ##   
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
		return 16;
	}

	@Override
	public int getWidth() {
		return 11;
	}

}
