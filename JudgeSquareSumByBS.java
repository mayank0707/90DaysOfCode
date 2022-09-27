Leetcode problem- https://leetcode.com/problems/sum-of-square-numbers/

Q.) Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

Solution- Using Binary Search.

  public boolean judgeSquareSum(int c) {
        long s = 0;
        long e =  (long)Math.sqrt(c);
        while(s<=e){
            long mid = s*s + e*e;
            if(mid==(long)c){
                return true;
            }else if(mid>(long)c){
                e--;
            }else{
                s++;
            }
        }
        return false;
    }
