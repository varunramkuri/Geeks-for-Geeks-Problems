class Solution {
    String firstRepChar(String s) {

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (visited[index]) {
                return String.valueOf(s.charAt(i));
            }

            visited[index] = true;
        }

        return "-1";
    }
}