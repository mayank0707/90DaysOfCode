
public class PowerOfTwo {

	public static void main(String[] args) {
		int n=32;
		boolean ans=(n&(n-1))==0; // 100000(value=n=32) & 011111(value=n-1) = 0
		System.out.println(ans);

	}

}
