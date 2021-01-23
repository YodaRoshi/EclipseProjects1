/*
Program		: JAC444 Workshop 1
Author		: Yasuaki Toyoda
ID			: 148584170
Date		: January 22,2021  
Description	: This program will print out a number Pyramid 
*/
public class PrintPyramid {

		
		public static void PadWithSpaces(int x) {
			for (int i = 0; i < x; i++)
	            System.out.print(" ");		// print without inserting a new line
		}
		
		public static void main(String[] args) {
			
			int numOfRows = 8;			// the number of  rows
			
		    for (int i = 1; i <= numOfRows; i++) {
		    	
		    	PadWithSpaces((numOfRows - i) * 4); // generates spaces before the first number
				
		    	for (int j = 0; j < i; j++) {		// prints numbers in ascending order 
		    		System.out.printf("%4d" , (int)Math.pow(2,j));	// d = int(right-justified), -d = int(left_justified) 
		        }
		        for (int j = i - 2; j >= 0; j--) {	// prints numbers in ascending order 
		    		System.out.printf("%4d" , (int)Math.pow(2,j));	
		        }
		        System.out.println();  // put a new line 
		    }
		}
}
