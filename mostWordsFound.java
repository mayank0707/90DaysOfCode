Leetcode problem- https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

Solution-

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 1, maxWords = 0;
        for(String str : sentences){
            for(int i = 0; i <str.length(); i++){
                if(str.charAt(i) == ' '){
                    max++;
                }
            }
            maxWords = Math.max(maxWords, max);
            max = 1;
        }
        return maxWords;
        
    }
}
