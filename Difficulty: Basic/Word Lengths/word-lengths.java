import java.util.*;

class Solution {
    public ArrayList<Integer> wordLengths(String s) {

        String[] words = s.split(" ");

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            result.add(words[i].length());
        }

        return result;
    }
}