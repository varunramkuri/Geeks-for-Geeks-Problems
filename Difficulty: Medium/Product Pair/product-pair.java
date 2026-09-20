

class Solution {
    public boolean isProduct(int[] arr,long target) {
        HashSet<Long> set=new HashSet<>();

        for(int x:arr) {
            if(x!=0 && target%x==0 && set.contains(target/x))
                return true;

            if(x==0 && target==0 && set.contains(0L))
                return true;

            set.add((long)x);
        }

        return false;
    }
}