class Solution {
   
    String removeDuplicates(String s) {
           boolean[] seen = new boolean[128];
           StringBuilder result = new StringBuilder();

           for (char ch : s.toCharArray())
               if (!seen[ch]) {
                   seen[ch] = true;
                   result.append(ch);
               }

           return result.toString();
       }
}
