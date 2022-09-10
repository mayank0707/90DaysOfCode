
//leetcode problem- https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegatives {

	public static void main(String[] args) {
		int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		System.out.println("Number of negatives: "+count(grid));
	}

	static int count(int[][] grid) {
		int ans=0;
		int r=0;
		int c=grid[0].length-1;
		while(r<grid.length && c>=0) {
			if(grid[r][c]<0) {
				ans+=grid.length-r;
				c--;
			}
			else {
				r++;
			}
		}
		return ans;
	}

}
