class Solution {
    public String missingPanagram(String s) {
        boolean[] present = new boolean[26];
        for (char ch : s.toCharArray())
            if (Character.isLetter(ch))
                present[Character.toLowerCase(ch) - 'a'] = true;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++)
            if (!present[i])
                result.append((char)('a' + i));

        return result.length() == 0 ? "-1" : result.toString();
    }
}