
public class PrintPyramid2 {
		
		public static void displaySpaces(int x) {
			for (int i = 0; i < x; i++)
	            System.out.print(" ");
		}
		
		public static void main(String[] args) {
			
			int numOfRows = 8;			// the number of  rows
			
		    for (int i = 1; i <= numOfRows; i++) {
		    	
		    	displaySpaces((numOfRows - i) * 4); // generates spaces before the first number
		        
		    	for (int j = 0; j < i; j++) {
		        	displaySpaces(4 - String.valueOf((int)Math.pow(2,j)).length());  
		            System.out.print((int)Math.pow(2, j));
		        }
		        for (int j = i - 2; j >= 0; j--) {
		        	displaySpaces(4 - String.valueOf((int)Math.pow(2,j)).length());   		
		            System.out.print((int)Math.pow(2, j));
		        }
		        System.out.println();  // put a new line 
		    }
		}
}
