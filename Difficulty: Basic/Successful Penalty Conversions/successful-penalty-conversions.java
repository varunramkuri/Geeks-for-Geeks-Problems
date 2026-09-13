class Solution {
    public int countCoversions(String s) {
        // code here
        int count = 0;
                for (int i = 1; i < s.length(); i++)
                    if (s.charAt(i - 1) == '2' && s.charAt(i) == '1')
                        count++;
                return count;
    }
}