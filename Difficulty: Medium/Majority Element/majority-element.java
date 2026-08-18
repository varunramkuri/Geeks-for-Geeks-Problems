import java.util.*;

class Solution {
    int majorityElement(int arr[])
    {

        Map<Integer, Integer> f = new HashMap<>();

        for (int x : arr) 
        {
            f.put(x, f.getOrDefault(x, 0) + 1);

            if (f.get(x) > arr.length / 2)
            {
                return x;
            }
        }

        return -1;
    }
}