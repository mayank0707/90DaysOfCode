import java.util.Scanner;

public class OddEvenByBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		if((n&1)==1) { // 1101 & 1 == 0001, that means if digit at unit place is 1, its Odd
			System.out.println("Odd");
		}
		else {
			System.out.println("Even");
		}
		s.close();
	}

}
