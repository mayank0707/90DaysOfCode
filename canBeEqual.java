Leetcode problem - https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/

Q.) You are given two integer arrays of equal length target and arr. In one step, you can select any non-empty subarray of arr and reverse it. 
    You are allowed to make any number of steps.
    Return true if you can make arr equal to target or false otherwise.
      
Solution-
      
      public boolean canBeEqual(int[] target, int[] arr) {
        int[] countMap = new int[1001]; //Map that holds count of ints

        //Iterate through the arrays
        for(int i = 0; i < target.length; i++) {
            countMap[target[i]]++; //Increment count of int found in target array
            countMap[arr[i]]--; //Decrement count of int found in arr array
        }

        //Iterate countMap
        for(int i : countMap) {
            //If not 0, it means target and arr do not match
            if(i != 0) {
                return false; //Return false
            }
        }
        //If this point is reached, the arrays are equal
	    return true;
    }
