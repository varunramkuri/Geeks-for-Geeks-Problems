class Solution {
    public String removeDuplicates(String s) {
        // code here
        StringBuilder result = new StringBuilder();

                for (char ch : s.toCharArray())
                    if (result.length() == 0 || result.charAt(result.length() - 1) != ch)
                        result.append(ch);
                 return result.toString();
    }
}