class Solution {
    public String sandwichedVowel(String s) 
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (isVowel(ch) && i > 0 && i < s.length() - 1&& !isVowel(s.charAt(i - 1))
                    && !isVowel(s.charAt(i + 1))) {
                continue;
            }

            result.append(ch);
        }

        return result.toString();
    }

    private boolean isVowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}