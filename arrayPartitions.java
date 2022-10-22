Leetcode problem- https://leetcode.com/problems/array-partition/

Q.) Given an integer array nums of 2n integers,
    group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. 
    Return the maximized sum.
      
Solution-
      
      public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i+=2){
            int min=Math.min(nums[i],nums[i+1]);
            ans+=min;
        }
        return ans;
        
      }
