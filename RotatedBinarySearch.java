
//Find the position of target element in Rotated Binary Search concept using Recursion.
public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9,1,2,3};
		int target=7;
		System.out.println(search(arr,target,0,arr.length));
	}

	private static int search(int[] arr, int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==target) {
			return m;
		}
		if(arr[s]<=arr[m]) { //left part is sorted
			if(target>=arr[s] && target<=arr[m]) { // if the target lies in first part
				return search(arr,target,s,m-1);
			}
			else { // else target lies in second part
				return search(arr,target,m+1,e);
			}
		}
		if(target>=arr[m] && target <=arr[e]) { // if first part is not sorted and target lies in second part
			return search(arr,target,m+1,e);
		}
		return search(arr,target,s,m-1); //else target would be in first half 
	}

}
