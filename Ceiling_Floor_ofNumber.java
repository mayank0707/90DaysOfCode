import java.util.Arrays;

public class Ceiling_Floor_ofNumber {
	//Ceiling of a no. means Smallest no. >=target no. in an array
	//Floor of a no. means Greater no. <=target no. in an array
	public static void main(String[] args) {// If its increasing order Sorted array
		int[] arr= {2,5,8,10,15,18,21};
		int target=14;
		System.out.println("Ceiling of "+target+" in "+Arrays.toString(arr)+" is at "+ceilingNumber(arr,target)+" index.");
		System.out.println("Ceiling of "+target+" in "+Arrays.toString(arr)+" is at "+floorNumber(arr,target)+" index.");
	}

	static int ceilingNumber(int[] arr, int target) {//For given input(arr, 14), answer is 4th index
		int start=0;
		int end=arr.length-1;
		if(target>arr[arr.length-1]) { //If target is even larger than last element 
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return start; //Situation when while loop violated (start=end+1)
	}

	static int floorNumber(int[] arr, int target) {//For given input(arr,14), answer is 3rd index
		int start=0;
		int end=arr.length-1;
		if(target<arr[start]) { //If target is even smaller than the first element
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return end; //Situation when the while loop violated (end=start-1)
	}

}
