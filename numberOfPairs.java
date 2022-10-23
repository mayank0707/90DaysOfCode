Leetcode problem- https://leetcode.com/problems/maximum-number-of-pairs-in-array/

Q.) You are given a 0-indexed integer array nums. In one operation, you may do the following:
    Choose two integers in nums that are equal.
    Remove both integers from nums, forming a pair.
    The operation is done on nums as many times as possible.

    Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and 
    answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
      
 Solution-
      
     public int[] numberOfPairs(int[] nums) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int num: nums){
            if(set.contains(num)){
                set.remove(num);
                count++;
            }else{
                set.add(num);
            }
        }
        res[0] = count;
        res[1] = set.size();
        return res;
    }

 
