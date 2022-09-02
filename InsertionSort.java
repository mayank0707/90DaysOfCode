import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {4,0,-2,5,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) { //i will be from 0 to length-2
			for(int j=i+1;j>0;j--) { 
				if(arr[j]<arr[j-1]) { 
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else { 
					break; //loop breaks as all the left side elements are sorted
				}
			}
		}
		
	}

}
