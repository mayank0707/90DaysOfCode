

		/*
		 Print this pattern:
		              *
		              * *
		              * * *
		              * * * *
		              * * *
		              * *
		              * 
		 */
public class PrintPattern {

	public static void main(String[] args) {
		print(4);
	}

	static void print(int n) {
		for(int row=0;row<2*n;row++) { //first loop is for total rows i.e. 7 here
			int totalCols=row>n ? 2*n-row : row ; //if row>n, col=n-(row-n)=2n-row
			for(int col=0;col<totalCols;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
