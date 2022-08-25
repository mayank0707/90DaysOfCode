import java.util.Scanner;

//LeetCode problem- Find number of elements with even number of digits.
public class DigitsCount_Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n=s.nextInt();
		int[] nums=new int[n];
		System.out.print("Enter numbers: ");
		for(int i=0;i<nums.length;i++) {
			nums[i]=s.nextInt();
		}
		System.out.println("Total no. of elements with even digits: "+evenDigits(nums));	
		s.close();
	}

	static int evenDigits(int[] nums) { //Counting the number of elements with even digits
		int ans=0;
		for(int i=0;i<nums.length;i++) {
			if(even(nums[i])) {
				ans++;
			}
		}
		return ans;
	}

	static boolean even(int num) { //checking whether no. of digits is even or not
		int countDigits=0;
		if(num<0) {
			num*=-1;
		}
		if(num==0) {
			countDigits=1;
		}
		while(num>0) {
			countDigits++;
			num/=10;
		}
		return countDigits%2==0;
	}
	
}
