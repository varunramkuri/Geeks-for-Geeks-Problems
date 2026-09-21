import java.util.*;                

class Solution {

    static int countDistinctPairs(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : map.keySet()) {

            int complement = target - num;

            // Complement doesn't exist
            if (!map.containsKey(complement)) {
                continue;
            }

            // Pair like (1,1)
            if (num == complement) {
                if (map.get(num) >= 2) {
                    count++;
                }
            }
            // Count each pair only once
            else if (num < complement) {
                count++;
            }
        }

        return count;
    }
}              