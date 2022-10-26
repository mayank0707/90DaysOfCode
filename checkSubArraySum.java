Leetcode problem- https://leetcode.com/problems/continuous-subarray-sum/

Q.) Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements 
    sum up to a multiple of k, or false otherwise.
    An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
      
Solution-
      
      public boolean checkSubarraySum(int[] nums, int k) {
        // check for 2 consecutive 0s as it is given in problem statement
        for(int i=1 ; i<nums.length ; i++){
          if(nums[i] == 0 && nums[i-1] == 0){
            return true;
          }
        }

        //prefix sum approach -> 2 conditions
        // 1) to check if current sum % k == 0
        // 2) to check if (prefix[i] - prefix[j]) % k == 0, where j = i-2 to j = 0 

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i=1 ; i<nums.length ; i++){
          prefix[i] = prefix[i - 1] + nums[i];
          if(prefix[i] % k == 0){
            return true;
          }

          int j = i - 2;
          while((j >= 0) && (prefix[i] - prefix[j] >= k)){
            if((prefix[i] - prefix[j]) % k == 0){
              return true;
            }
            j--;
          }
        }

        return false;
    }
