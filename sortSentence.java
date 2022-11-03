Leetcode problem- https://leetcode.com/problems/sorting-the-sentence/

Solution-
  
  public String sortSentence(String s) {
        String splited[] = s.split(" ");
        String helper[] = new String[splited.length];
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<splited.length; i++){
            int idx = splited[i].charAt(splited[i].length()-1)-'0'; // getting last digit.
            helper[idx-1] = splited[i].substring(0,splited[i].length()-1);//delete last digit
        }

        for(int i=0; i<helper.length; i++){
            ans.append(helper[i]).append(" ");
        }

        return ans.toString().trim();
    }
