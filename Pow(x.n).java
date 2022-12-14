Leetcode problem-https://leetcode.com/problems/powx-n/
  
  Q.) Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
  
  Solution- 
    public double myPow(double x, int n) {
        double value = power(x,Math.abs(n));
        if(n>0)return value;
        else{
            return 1/value;
        }
    }
    public double power(double x,int n)
	  {  
        if(n == 0)return 1;
        double temp = power(x, n/2);
        temp = temp * temp;
        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }
