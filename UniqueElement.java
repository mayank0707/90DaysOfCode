
public class UniqueElement {

	public static void main(String[] args) {
		int[] arr= {5,5,2,3,2,3,1};
		System.out.println("Unique Element: "+findUnique(arr));
	}

	//We can solve this problem by firstly sort the array and then comparison but that will give O(nlogn) complexity.
	// So using XOR associative property and (a^0 =a , a^a=0) which gives O(n) complexity.
	
	private static int findUnique(int[] arr) {
		int unique=0;
		for(int n: arr) {
			unique ^= n; 
		}
		return unique; // Answer= 1
	}

}
