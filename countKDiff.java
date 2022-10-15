Leetcode problem- https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/

Q.) Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

  Solution-
  
  public int countKDifference(int[] nums, int k) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    ans++;
                }
            }
        }
        return ans;
    }
