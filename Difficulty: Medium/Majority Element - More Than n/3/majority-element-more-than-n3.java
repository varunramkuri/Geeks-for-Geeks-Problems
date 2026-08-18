import java.util.*;

class Solution
{
    public List<Integer> findMajority(int[] arr) 
    {
        Map<Integer, Integer> f = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int x : arr) 
            f.put(x, f.getOrDefault(x, 0) + 1);
        for (int x : f.keySet()) 
        {
            if (f.get(x) > arr.length / 3) 
            {
                ans.add(x);
            }
        }

        Collections.sort(ans);
        return ans;
    }
}