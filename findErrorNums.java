Leetcode problem- https://leetcode.com/problems/set-mismatch/

Q.) You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to          another number in the set, which results in repetition of one number and loss of another number.
     You are given an integer array nums representing the data status of this set after the error.
     Find the number that occurs twice and the number that is missing and return them in the form of an array.
  
 Solution- Used Cyclic Sort.
  
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for(int value=0;value<nums.length;value++){
            if(nums[value]!=value+1){
                return new int[]{nums[value],value+1};
            }
        }
        return new int[]{-1,-1};
    }
