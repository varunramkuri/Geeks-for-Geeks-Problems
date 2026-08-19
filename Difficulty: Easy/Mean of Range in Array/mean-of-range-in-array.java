import java.util.*;

class Solution 
{
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) 
    {
        int n = arr.length;
        long[] prefix = new long[n];
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i - 1] + arr[i];
        }
       ArrayList<Integer> ans = new ArrayList<>();
          for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum;

            if (l == 0)
            {
                sum = prefix[r];
            }
            else
            {
                sum = prefix[r] - prefix[l - 1];
            }

            int length = r - l + 1;

            ans.add((int)(sum / length));
        }

        return ans;
    }
}