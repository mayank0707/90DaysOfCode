Leetcode problem- https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/

Q.) Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

Solution- 
  
  public int countElements(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>min && nums[i]<max){
                ans++;
            }
        }
        return ans;
    }
