class Solution {
    public String extractMessage(String s) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (i + 2 < s.length() &&
                s.charAt(i) == 'L' &&
                s.charAt(i + 1) == 'I' &&
                s.charAt(i + 2) == 'E') {

                if (ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ') {
                    ans.append(' ');
                }

                i += 3;

            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        // Remove trailing space
        if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
            ans.deleteCharAt(ans.length() - 1);
        }

        return ans.toString();
    }
}