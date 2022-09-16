LeetCode problem- https://leetcode.com/problems/power-of-two/

Q.) Given an integer n, return true if it is a power of two. 
    Otherwise, return false. An integer n is a power of two, if there exists an integer x such that n == 2^x.
    
Solution- Solved it using Recursion.

    public boolean isPowerOfTwo(int n) {
        return recursion(n, 0);    
    }
    public boolean recursion(int number, int start){
        double power = Math.pow(2, start);
        if(power>number){
            return false;
        }
        if(power==number){
            return true;
        }
        return recursion(number, start+1);
    }
