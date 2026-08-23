class Solution {
    public void sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        for (int i = 0; i < arr.length; i++)
            arr[i] = sum - arr[i];
      
    }
}