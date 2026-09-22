class Solution {
    public boolean isSubSeq(String s1,String s2) {
        int k=0;
        int count=0;

        for(int i=0;i<s1.length();i++) {
            for(int j=k;j<s2.length();j++) {
                if(s1.charAt(i)==s2.charAt(j)) {
                    count++;
                    k=j+1;
                    break;
                }
            }
        }

        return count==s1.length();
    }
}