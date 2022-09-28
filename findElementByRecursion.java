
public class findElementByRecursion {

	public static void main(String[] args) {
		int[] arr= {12,4,8,2,10,5};
		int target=2;
		System.out.println("Element found at position "+find(arr,target,0));
	}

	private static int find(int[] arr, int target, int start) {
		if(start==arr.length) {
			return -1;
		}
		if(arr[start]==target) {
			return start;
		}
		else {
			return find(arr,target,start+1);
		}
	}
	
}
