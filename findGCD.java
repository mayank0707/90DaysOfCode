Leetcode problem- https://leetcode.com/problems/find-greatest-common-divisor-of-array/

Solution-
  
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        if(nums[nums.length-1]%nums[0]==0){
            return nums[0];
            
        }
        else{
            for(int i=1;i<=nums[0];i++){
                if(nums[0]%i==0 && nums[nums.length-1]%i==0){
                    ans=i;
                }
            }
        }
        return ans;
        
    }
