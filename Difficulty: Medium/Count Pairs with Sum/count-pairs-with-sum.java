class Solution {
    int countPairs(int[] arr,int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;

        for(int x:arr)
        {
            int need=target-x;
            if(map.containsKey(need))
                count+=map.get(need);
            map.put(x,map.getOrDefault(x,0)+1);
        }

        return count;
    }
}