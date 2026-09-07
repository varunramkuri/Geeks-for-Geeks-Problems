class Solution {
    public boolean nonRepetitive(String s) {
        // code here
     boolean[] seen = new boolean[26];

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (seen[ch - 'A'] && ch != s.charAt(i - 1)) {
                    return false;
                }

                seen[ch - 'A'] = true;
            }

            return true;   
    }
}