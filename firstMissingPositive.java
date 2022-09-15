#LeetCode problem-https://leetcode.com/problems/first-missing-positive/

Q.) Given an unsorted integer array nums, return the smallest missing positive integer.
    You must implement an algorithm that runs in O(n) time and uses constant extra space.
  
  
Solution- Using Cycle Sort concept.
  
  public int firstMissingPositive(int[] nums) {
        int i = 0 ;

		while( i < nums.length){
			int correct = nums[i]-1;
			if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
				int temp = nums[i];
				nums[i] = nums[correct];
				nums[correct] = temp;
			}

			else {
				i++;
			}
		}

		for(int j = 0 ; j< nums.length ; j++){
			if(nums[j] != j+1){
			return j+1;
			}
		}
    
    return nums.length+1;
  }
  
