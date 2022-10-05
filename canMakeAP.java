Leetcode problem- https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

Q.) A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
    Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
      
Solution- 
      
      public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff=arr[1]-arr[0];
        if(arr.length<=2){
            return true;
        }
        for(int i=1;i<arr.length-1;i++){
            if((arr[i+1]-arr[i])!=diff){
                return false;
            }
        }
        return true;    
    }
