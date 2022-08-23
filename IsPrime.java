import java.util.Scanner;

public class IsPrime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter number: ");
		int x=s.nextInt();
		boolean b=isPrimeNumber(x);
		if(b==true) {
			System.out.println(x+" is a prime number.");
		}
		else {
			System.out.println(x+" is not a prime number");
		}
		s.close();
		
		
	}
	
	static boolean isPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}
		int c=2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return c*c>n;
	}
}
