LeetCode problem- https://leetcode.com/problems/product-of-array-except-self/

Solution-
  
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int counter=0,prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                counter++;
            }
            else{
                prod*=nums[i]; 
            }   
        }
        for(int i=0;i<nums.length;i++){
            if(counter==0){
                ans[i]=prod/nums[i];
            }
            else if(counter==1){
                ans[i]=nums[i]!=0?0:prod;
            }
            else{
                ans[i]=0;
            }
            
        }
        return ans;
    }
