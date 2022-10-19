Leetcode problem- https://leetcode.com/problems/reverse-vowels-of-a-string/
  
Q.) Given a string s, reverse only all the vowels in the string and return it.
    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
  
Solution- 
  
  public String reverseVowels(String s) {
        List<Character> list=Arrays.asList('a', 'e', 'i','o','u','A','E','I','O','U');

        char[] ch=s.toCharArray();

        System.out.println(Arrays.toString(ch));
        int i=0;
        int j=ch.length-1;

        while(i<j){

            if(list.contains(ch[i]) && list.contains(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }else if(list.contains(ch[i]) && !list.contains(ch[j])){
                j--;
            }else if(!list.contains(ch[i]) && list.contains(ch[j])){
                i++;
            }else if(!list.contains(ch[i]) && !list.contains(ch[j])){
                i++;
                j--;
            }

        }

        String res=String.valueOf(ch);
        return res;
    }
