class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        // code here
       ArrayList<Integer> result = new ArrayList<>();

              for (int i = m; i <= n; i++)
              {
                  int x = i;
                  int rev = 0;
                  while (x > 0) 
                  {
                      rev = rev * 10 + x % 10;
                      x /= 10;
                  }
                  if (i == rev)
                      result.add(i);
              }

              return result; 
    }
}