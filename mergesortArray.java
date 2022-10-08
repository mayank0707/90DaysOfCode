Leetcode problem- https://leetcode.com/problems/sort-an-array/

Q.) Given an array of integers nums, sort the array in ascending order and return it.
    You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
  
Solution-
  
  public int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));
        
        return merge(left,right);
        
    }
    private int[] merge(int[] first, int[] second){
        int i=0,j=0,k=0;
        int[] mix=new int[first.length + second.length];
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
