import java.util.Arrays;

public class FirstLastPosition {

	public static void main(String[] args) {
		int[] nums= {5,7,7,7,7,8,8,10};
		int target=7;
		System.out.println("First and Last position: "+Arrays.toString(searchRange(nums,target)));

	}
	public static int[] searchRange(int[] nums,int target) { //find the range 
		int[] ans = {-1,-1};
		//checks for first occurrence if target first
		ans[0]=search(nums,target,true);
		if(ans[0]!=-1) {
			ans[1]=search(nums,target,false);
		}
		return ans;
	}
	//this function returns the index value of target
	static int search(int[] nums,int target, boolean findStartIndex) {
		int ans=-1;
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(nums[mid]<target) {
				start=mid+1;
			}
			else if(nums[mid]>target) {
				end=mid-1;
			}
			else {
				//probable ans found
				ans=mid;
				if(findStartIndex) {
					end=mid-1;
				}
				else {
				start=mid+1;
				}
			}
		} 
		return ans;
	}
}
