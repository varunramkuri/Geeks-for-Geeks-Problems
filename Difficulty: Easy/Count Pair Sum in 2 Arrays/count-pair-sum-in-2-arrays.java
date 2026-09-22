import java.util.*;

class Solution 
{
    public int countPairs(int[] arr1,int[] arr2,int x) 
    {
        int pair=0;
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<arr1.length;i++)
            m.put(arr1[i],m.getOrDefault(arr1[i],0)+1);

        for(int r=0;r<arr2.length;r++)
            if(m.containsKey(x-arr2[r]))
                pair+=m.get(x-arr2[r]);

        return pair;
    }
}