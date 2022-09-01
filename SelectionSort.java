import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {4,-2,0,-1,5,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxIndex=getMaxIndex(arr,0,last);
			int temp=arr[maxIndex];
			arr[maxIndex]=arr[last];
			arr[last]=temp;
		}
	}

	static int getMaxIndex(int[] arr, int i, int last) {
		int start=i;
		int end=last;
		int maxIndex=start;
		for(int j=start+1;j<=end;j++) {
			if(arr[j]>arr[maxIndex]) {
				maxIndex=j;
			}
		}
		return maxIndex;
	}

}
