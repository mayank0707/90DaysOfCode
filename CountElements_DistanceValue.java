Leetcode problem- https://leetcode.com/problems/find-the-distance-value-between-two-arrays/

Q.) Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
    The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
    
Solution- We have to count no. of elements in Array 1(arr1) such that for that arr1 element there is NO element in Array 2 which satisfies |arr1[i]-arr2[j]| <= d.


    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;
        for(int i=0;i<arr1.length;i++) {
            if(valid(arr2, arr1[i], d)) {
                count++;
            }
        }
        return count;
    }

    public boolean valid(int [] arr, int k, int d) {
        int low = 0;
        int high = arr.length-1;
        while(low <= high) {
            int mid = (low+high)/2;
            int dif = arr[mid] - k;
            if(Math.abs(dif) <= d) {
                return false;
            } else if(arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return true;
    }
