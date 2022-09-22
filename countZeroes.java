
public class countZeroes {

	public static void main(String[] args) {
		int num=102030;
		System.out.println("No. of zeroes: "+count(num));
	}
	
	public static int count(int num) {
		if(num==0) {
			return 1;
		}
		return helper(num,0);
	}
	private static int helper(int num,int c) {
		if(num==0) {
			return c;
		}
		int rem=num%10;
		if(rem==0) {
			return helper(num/10,c+1);
		}
		return helper(num/10,c);
	}

}
