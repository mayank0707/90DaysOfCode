Leetcode problem- https://leetcode.com/problems/top-k-frequent-elements/

Q.) public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(!map.containsKey(n)){
                map.put(n,0);
            }
            map.put(n,(map.get(n)+1));
        }
        
         ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<k;i++){
            int max = Collections.max(map.values());
            if(max>0){
                for (Map.Entry m :map.entrySet()) {
                    if((int)m.getValue()==max){
                        list.add((int)m.getKey());
                        map.replace((int)m.getKey(),Integer.MIN_VALUE);
                    }
                    if(list.size()==k)
                        break;
                }
            }
            if(list.size()==k)
                break;
        }
        int arr[]= new int[list.size()];
        for(int j=0;j<arr.length;j++)
            arr[j]=list.get(j);
        return arr;
    }
