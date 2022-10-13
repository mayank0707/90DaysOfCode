Leetcode problem- https://leetcode.com/problems/get-maximum-in-generated-array/

Q.) You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:

    nums[0] = 0
    nums[1] = 1
    nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    Return the maximum integer in the array nums.
      
      
Solution-
      
      public int getMaximumGenerated(int n) {
        if(n==0){
            return 0;
        }
        int[] arr=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        int j=3;
        int i=1;
        while(j<n+1){
            if(2*i<=n){
                arr[2*i]=arr[i];
            }
            if(2*i+1<=n){
                arr[2*i+1]=arr[i]+arr[i+1];
            }
            j++;
            i++;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
