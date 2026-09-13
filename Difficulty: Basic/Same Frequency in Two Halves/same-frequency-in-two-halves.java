class Solution {
    public boolean halvesMatch(String s) {

        int n = s.length();
        int half = n / 2;

        int[] freq = new int[256];

        for (int i = 0; i < half; i++)
        {
            freq[s.charAt(i)]++;
        }
        int start = (n % 2 == 0) ? half : half + 1;

        for (int i = start; i < n; i++)
        {
            freq[s.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++)
        {
            if (freq[i] != 0) 
                return false;
        }

        return true;
    }
}