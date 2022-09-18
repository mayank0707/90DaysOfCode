
public class CountSetBits {

	public static void main(String[] args) {
		int n=9; // 1001
		int count=0;
		while(n>0) {
			if((n &1)==1) {
				count++;
			}
			n=n>>1;
		}
		System.out.println("No. of set bits: "+count);

	}

}
