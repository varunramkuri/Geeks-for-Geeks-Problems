import java.util.*;

class Solution {
    public boolean commonString(String[] s, String[] t) {

        HashSet<String> set = new HashSet<>();

        // Store first array
        for (String str : s) {
            set.add(str);
        }

        // Check second array
        for (String str : t) {
            if (set.contains(str)) {
                return true;
            }
        }

        return false;
    }
}