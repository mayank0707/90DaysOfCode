Leetcode problem- https://leetcode.com/problems/string-matching-in-an-array/

Q.) Given an array of string words. Return all strings in words which is substring of another word in any order. 
    String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].
  
Solution-
  
  public List<String> stringMatching(String[] words) {
        List<String> res = new ArrayList<>();
        for(String word : words){
            for(int i = 0;i<words.length;i++){
                if(!word.equals(words[i])){
                    if(words[i].contains(word)){
                        if(!res.contains(word)){
                            res.add(word);
                        }
                    }
                }
                else{
                    continue;
                }
            }
        }
        return res;
    }
