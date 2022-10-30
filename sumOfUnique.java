Leetcode problem- https://leetcode.com/problems/sum-of-unique-elements/

Q.) You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
    Return the sum of all the unique elements of nums.
  
Solution-
  
  public int sumOfUnique(int[] nums) {
    HashMap<Integer,Integer> map=new HashMap<>();
    int sum=0;
    for(int n:nums){
        if(!map.containsKey(n)){
            map.put(n,0);
        }
        map.put(n, map.get(n) + 1);
    }
    System.out.println("HashMap: " + map);
    Integer value=1;
    // iterate each entry of hashmap
     for(Map.Entry m : map.entrySet()){    
       if(m.getValue() == value) {
         sum+=(Integer)m.getKey();
       }
     }
    return sum;
        
 }
