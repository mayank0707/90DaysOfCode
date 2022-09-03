import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr= {4,1,7,5,3,6,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correct=arr[i]-1; //finding the correct index
			if(arr[i]!=arr[correct]) { //checking if its matches with the element at correct index
				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
			else { //increment the i value if element is at correct index
				i++;
			}
		}	
	}
}

