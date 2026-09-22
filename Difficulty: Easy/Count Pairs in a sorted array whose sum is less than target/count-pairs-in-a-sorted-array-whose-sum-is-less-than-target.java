class Solution {
    public int countPairs(int[] arr,int target) {
        int l=0,r=arr.length-1;
        int count=0;

        while(l<r) {
            if(arr[l]+arr[r]<target) {
                count+=r-l;
                l++;
            } else
                r--;
        }

        return count;
    }
}