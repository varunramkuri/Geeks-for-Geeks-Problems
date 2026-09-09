class Solution {
    String removeReverse(String S) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i) - 'a']++;
        }

        char[] str = S.toCharArray();

        int left = 0;
        int right = str.length - 1;

        // 0 = left to right
        // 1 = right to left
        int direction = 0;

        while (left <= right) {

            if (direction == 0) {

                char ch = str[left];

                if (freq[ch - 'a'] == 1) {
                    left++;
                } else {
                    freq[ch - 'a']--;
                    str[left] = '#';
                    left++;
                    direction = 1;
                }

            } else {

                char ch = str[right];

                if (freq[ch - 'a'] == 1) {
                    right--;
                } else {
                    freq[ch - 'a']--;
                    str[right] = '#';
                    right--;
                    direction = 0;
                }
            }
        }

        // If the final direction is reversed,
        // reverse the complete array
        if (direction == 1) {
            left = 0;
            right = str.length - 1;

            while (left < right) {
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;

                left++;
                right--;
            }
        }

        // Build final answer without '#'
        StringBuilder answer = new StringBuilder();

        for (char ch : str) {
            if (ch != '#') {
                answer.append(ch);
            }
        }

        return answer.toString();
    }
}