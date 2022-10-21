Leetcode problem- https://leetcode.com/problems/max-number-of-k-sum-pairs/

Q.) You are given an integer array nums and an integer k.
    In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
    Return the maximum number of operations you can perform on the array.
  
Solution-
  
  public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
        int count=0;
        int i=0,j=nums.length-1; //use of two-pointer
        while(i<j){
		//if Integer at i and j = equal, increament the Count and move the pointer
            if(nums[i]+nums[j]==k){
                count +=1;
                j--;
                i++;
            }
			// if the Integers at i and j are greater the k, we need the decrease the sum so we move the j pointer by -1 
            else if(nums[i]+nums[j]>k){
                j--;
            }  
			// else we increment the i pointer by +1
            else {
                i++;
            }
        }
		return count;
        
    }
