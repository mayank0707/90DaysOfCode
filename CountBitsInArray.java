LeetCode problem- https://leetcode.com/problems/counting-bits/

Q.) Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
  
Solution-
  
   public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=count(i);
        }
        return ans;
        
    }
    public int count(int p){
        int c=0;
        while(p>0){
            if((p&1)==1){
                c++;
            }
            p>>=1;
        }
        return c;
    }
