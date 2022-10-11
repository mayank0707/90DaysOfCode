Leetcode problem- https://leetcode.com/problems/kth-missing-positive-number/

Solution-

  public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int j=1;
        while(k>0){
           if(!list.contains(j)){
               k--;
           } 
            j++;
        }
        return j-1;
        
    }
