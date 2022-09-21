LeetCode problem- https://leetcode.com/problems/contains-duplicate/

Solution- Solved using the HashSet concept.
  
   public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums){
            if(!set.add(val)){
                return true;
            }
            set.add(val);
        }
        return false;
    }
