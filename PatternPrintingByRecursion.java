
/*
Print pattern 1-> * * * *
  				  * * *
  				  * *
  				  *
  
Print pattern 2-> *
				  * *
				  * * *
				  * * * *
*/
public class PatternPrintingByRecursion {

	public static void main(String[] args) {
		System.out.println("Pattern 1:");
		pattern1(4,0); // starting by taking row=4 and col=0 as the top left element
		System.out.print("\nPattern 2:");
		pattern2(4,0);
	}

	private static void pattern1(int row, int col) {
		if(row==0) {
			return ;
		}
		if(col<row) {
			System.out.print("*");
			pattern1(row,col+1);
		}
		else {
			System.out.println();
			pattern1(row-1,0);
		}	
	}
	
	private static void pattern2(int row, int col) { 
		if(row==0) {
			return ;
		}
		// Pattern will keep adding into the stack till condition breaks and then it start popping out with pattern print
		if(col<row) {
			pattern2(row,col+1); 
			System.out.print("*");
		}
		else {
			pattern2(row-1,0);
			System.out.println();
		}	
		
	}

}
