class Solution {
    public boolean isGoodString(String s) {
        for (int i = 1; i < s.length(); i++) {
        int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));
           diff = Math.min(diff, 26 - diff);
           if (diff != 1)
                return false;
        }

        return true;
    }
}