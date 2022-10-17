Leetcode problem- https://leetcode.com/problems/count-number-of-bad-pairs/

Q.) You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].
    Return the total number of bad pairs in nums.
  
Solution-
  
  public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        long count = 0;
        for(int i = 0; i < nums.length; i++){
            int diff = i - nums[i];
            if(seen.containsKey(diff)){
                count += (i - seen.get(diff));
            }else{
                count += i;
            }
            seen.put(diff, seen.getOrDefault(diff, 0) + 1);
        }
        return count;
    }
