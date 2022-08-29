import java.util.Arrays;

public class RowColumnWiseMatrix_BS {

	public static void main(String[] args) {
		int[][] matrix= {
				{10,12,14,25},
				{11,13,21,26},
				{15,18,24,28},
				{17,20,27,30}
		};
		int target=24;
		System.out.println(target+" found at "+Arrays.toString(search(matrix,target))+" position.");

	}
	static int[] search(int[][]matrix, int target){
		int r=0; //lower bound(first row, first col)
		int c=matrix.length-1; //upper bound(first row, last col)
		while(r<matrix.length && c>=0) {
			if(matrix[r][c]==target) {
				return new int[]{r,c};
			}
			if(matrix[r][c]<target) {
				r++; //moves towards down
			}
			else {
				c--; //moves towards left
			}
		}
		return new int[] {-1,-1};
	}

}
