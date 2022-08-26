import java.util.Arrays;

public class OrderAgnostic_BS {

	public static void main(String[] args) {
		int[] arr1= {-4, -2, 0, 10, 21, 27, 40};
		int target1=21;
		System.out.println("Element "+target1+" in "+Arrays.toString(arr1)+" found at "+orderAgnosticsBS(arr1,target1)+" index");
		int[] arr2= {25,21,10,7,2,-1,-5};
		int target2=21;
		System.out.println("Element "+target2+" in "+Arrays.toString(arr2)+" found at "+orderAgnosticsBS(arr2,target2)+" index");
	}
	
	static int orderAgnosticsBS(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[start]<=arr[end]) {// Checking whether its increasing order BS
				if(arr[mid]>target) {
					end=mid-1;
				}
				else {
					start=mid+1;
				}
			}
			else { 
				if(arr[mid]>target) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		}
		return -1;
	}

}
