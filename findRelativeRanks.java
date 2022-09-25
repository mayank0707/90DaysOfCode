Based on Sorting:
Leetcode problem- https://leetcode.com/problems/relative-ranks/

Solution- Using Hashmap 
  
  public String[] findRelativeRanks(int[] score) {
        String str[]=new String[score.length];        
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,String>h=new HashMap<Integer,String>();
        for(int i=0;i<score.length;i++)
        {
            l.add(score[i]);
        }
        Collections.sort(l);
        int len=l.size();        
        for(int i=l.size()-1;i>=0;i--)
        {
            if(i==len-1)
            {
                h.put(l.get(i),"Gold Medal");
                continue;
            }
            else if(i==len-2)
            {
                h.put(l.get(i),"Silver Medal");
                continue;
            }
            else if(i==len-3)
            {
                h.put(l.get(i),"Bronze Medal");
                continue;
            }
            else
            {
                h.put(l.get(i),Integer.toString(len-i));
                continue;
            }
        }             
        for(int i=0;i<score.length;i++)
        {
            str[i]=h.get(score[i]);
        }
        return str;
    }
