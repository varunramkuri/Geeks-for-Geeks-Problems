class Solution {
    public String boomNumber(int k) {
        // code here
        StringBuilder result = new StringBuilder();

                int len = 1;
                while (k > (1 << len)) 
                {
                    k -= (1 << len);
                    len++;
                }
                k--;
               for (int i = len - 1; i >= 0; i--) 
                {
                    if ((k & (1 << i)) == 0)
                        result.append('2');
                    else
                        result.append('3');
                }

                return result.toString();
    }
}