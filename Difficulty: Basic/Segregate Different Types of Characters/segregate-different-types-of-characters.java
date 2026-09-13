class Solution {
    public String[] splitString(String s) {
        // code here
        StringBuilder letters = new StringBuilder();
              StringBuilder digits = new StringBuilder();
              StringBuilder special = new StringBuilder();

              for (char ch : s.toCharArray()) {
                  if (Character.isLetter(ch))
                      letters.append(ch);
                  else if (Character.isDigit(ch))
                      digits.append(ch);
                  else
                      special.append(ch);
              }

              return new String[]{
                  letters.length() == 0 ? "-1" : letters.toString(),
                  digits.length() == 0 ? "-1" : digits.toString(),
                  special.length() == 0 ? "-1" : special.toString()
              };
    }
}
