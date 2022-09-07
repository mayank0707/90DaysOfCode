import java.util.Scanner;

public class FibonacciByRecursion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		System.out.println(n+ "th Fibonacci number: "+findFibonacci(n));
		s.close();
	}

	static int findFibonacci(int n) {
		if(n<2) {
			return n;
		}
		return findFibonacci(n-1)+findFibonacci(n-2);
	}

}
