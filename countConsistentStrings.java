Leetcode problem- https://leetcode.com/problems/count-the-number-of-consistent-strings/

Q.) You are given a string allowed consisting of distinct characters and an array of strings words. 
    A string is consistent if all characters in the string appear in the string allowed.
    Return the number of consistent strings in the array words.

Solution-

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        int count=0;
        for(String s: words){
            int check=1;
            for(char c:s.toCharArray()){
                if(!set.contains(c)){
                    check=0;
                }
            }
            if(check==1)count++;
        }
        return count;
        
    }
}
