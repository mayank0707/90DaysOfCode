Leetcode problem- https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/

Q.) You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. 
    Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
    Return the minimum possible sum of new1 and new2.
  
Solution-
  
    public int minimumSum(int num) {
        int len = (int) (Math.log10(num) + 1); //to calculate length
        //System.out.println(len);
        int[] arr=new int[len];
        int p=num;
        int i=0;
        while(p>0){
            arr[i]=p%10;
            p/=10;
            i++;
        }
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int ans=arr[0]*10+arr[len-1]+arr[1]*10+arr[len-2];
        return ans;
    }
