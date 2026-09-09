class Solution {
    public String reverse(String s) {

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        // Pop characters to get reverse
        String result = "";

        while (!stack.isEmpty()) {
            result = result + stack.pop();
        }

        return result;
    }
}