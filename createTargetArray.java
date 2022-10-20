Leetcode problem- https://leetcode.com/problems/create-target-array-in-the-given-order/

Q.) Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.
  
Solution-
  
  public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        
        for(int i = 0; i < index.length; i++){
            int ind = index[i];
            
            if(ind < i){
                int j = i;
                while(j > ind){
                    target[j] = target[j - 1]; 
                    target[j - 1] = nums[i];
                    j--;
                }
            }
            else{
                 target[i] = nums[ind];
            }
            
        }
        return target;
    }
