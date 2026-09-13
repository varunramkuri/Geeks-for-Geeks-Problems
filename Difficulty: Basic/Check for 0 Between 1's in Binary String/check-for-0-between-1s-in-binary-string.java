class Solution {
    public boolean checkBinary(String s) {

        boolean oneFound = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '1') {
                oneFound = true;
            } 
            else if (oneFound && i + 1 < s.length() && s.charAt(i + 1) == '1') {
                return false;
            }
        }

        return true;
    }
}