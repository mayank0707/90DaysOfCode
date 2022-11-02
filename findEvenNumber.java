Leetcode problem- https://leetcode.com/problems/finding-3-digit-even-numbers/

Q.) You are given an integer array digits, where each element is a digit. The array may contain duplicates.
    You need to find all the unique integers that follow the given requirements:

    The integer consists of the concatenation of three elements from digits in any arbitrary order.
    The integer does not have leading zeros.
    The integer is even.
    For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.

    Return a sorted array of the unique integers.
      
Solution-
      
    public int[] findEvenNumbers(int[] digits) {
        int[] counts = new int[10];
        for (int digit : digits) {
          counts[digit]++;
        }

        List<Integer> res = new ArrayList<>();
        int highest, middle, lowest;
        boolean isTarget = false;

        // only checking even numbers with a step size of 2
        for (int i = 100; i < 999; i += 2) {
          highest = i / 100;
          middle = i / 10 % 10;
          lowest = i % 10;
          isTarget = true;

          if (--counts[highest] < 0) isTarget = false;
          if (--counts[middle] < 0) isTarget = false; 
          if (--counts[lowest] < 0) isTarget = false; 

          if (isTarget) res.add(i);

          counts[highest]++;
          counts[middle]++;
          counts[lowest]++;
        }

        // convert to array
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
          arr[i] = res.get(i);
        }
        return arr;
    }
