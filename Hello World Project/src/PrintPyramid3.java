/*
Program		: JAC444 Workshop 1
Author		: Yasuaki Toyoda
ID			: 148584170
Date		: January 22,2021  
Description	: This program will print out a number Pyramid 
*/
public class PrintPyramid3 {

		
		public static void main(String[] args) {
			
			int base = 2;
			String format = "%4s";
			
		    for (int i = 1; i <= 8; i++) {
				for (int k = 0; k < 8 - i; k++) 
					System.out.printf(format,""); // print without inserting a new line
				
		    	for (int j = 0; j < i; j++) 		// prints numbers in ascending order 
		    		System.out.printf(format , String.valueOf((int)Math.pow(base,j)));	// d = int(right-justified), -d = int(left_justified) 
		        
		        for (int j = i - 2; j >= 0; j--) 	// prints numbers in ascending order 
		    		System.out.printf(format , String.valueOf((int)Math.pow(base,j)));
		        
		        System.out.println();  // put a new line 
		    }
		}
}
