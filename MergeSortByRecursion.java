import java.util.Arrays;

public class MergeSortByRecursion {

	public static void main(String[] args) {
		int[] arr= {5,2,4,3,1};
		int[] ans=mergeSort(arr);
		System.out.println(Arrays.toString(ans));

	}
	
	private static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
	}

	private static int[] merge(int[] first, int[] second) {
		int i=0,j=0,k=0;
		int[] mix = new int[first.length + second.length];
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		
		//if any array has remaining elements
		while(i<first.length) { //first array
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length) { //second array
			mix[k]=second[j];
			k++;
			j++;
		}
		
		return mix;
	}

}
