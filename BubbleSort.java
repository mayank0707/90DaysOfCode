import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {4,-2,0,-1,5,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int[] arr) {
		boolean swapped; 
		for(int i=0;i<arr.length;i++) { //i acts as a pass here
			swapped=false;
			for(int j=1;j<=arr.length-i-1;j++) { //length-i-1 means the element from end keep on sorting with each pass
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if(swapped==false) { //Checks if swapped value is false that means array is completely sorted now
				break;
			}
		}
	}

}
