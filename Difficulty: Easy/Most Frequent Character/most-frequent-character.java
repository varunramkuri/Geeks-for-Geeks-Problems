class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int[] freq = new int[26];

              for (char ch : s.toCharArray())
                  freq[ch - 'a']++;
                  char result = 'a';
              for (int i = 1; i < 26; i++)
                  if (freq[i] > freq[result - 'a'])
                      result = (char)('a' + i);

              return result;
    }
}