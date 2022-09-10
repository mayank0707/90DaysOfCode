#leetcode medium problem
Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

Q.) Find peak index in mountain array.
    An array arr a mountain if the following properties hold:

    arr.length >= 3
    There exists some i with 0 < i < arr.length - 1 such that:
    arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
      
Solution-
      
      public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid;
            }
            else if(arr[mid]<arr[mid-1]){
                end=mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
