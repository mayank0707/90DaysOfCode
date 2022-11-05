Leetcode problem- https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/

Q.) A string is good if there are no repeated characters.
    Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.
    Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
    A substring is a contiguous sequence of characters in a string.
      
Solution-
      
      public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length()-2;i++)
        {
                String res = s.substring(i,i+3);
                if(res.charAt(0)!=res.charAt(1) && res.charAt(1)!=res.charAt(2)&& res.charAt(0)!=res.charAt(2))
                    c++;
        }    
        return c;
    }
