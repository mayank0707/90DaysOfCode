Leetcode problem- https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

Solution-
  
  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="",str2="";
        for(String p:word1){
            str1=str1.concat(p);
        }
        for(String q:word2){
            str2=str2.concat(q);
        }
        //System.out.println(str1+'\n'+str2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
