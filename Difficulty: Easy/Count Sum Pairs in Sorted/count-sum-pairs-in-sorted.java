class Solution {
    int countPairs(int[] arr,int target)
    {
        int i=0,j=arr.length-1;
        int count=0;

        while(i<j) 
        {
            int sum=arr[i]+arr[j];

            if(sum==target) 
            {
                if(arr[i]==arr[j])
                {
                    int n=j-i+1;
                    count+=n*(n-1)/2;
                    break;
                }

                int a=arr[i],b=arr[j];
                int x=0,y=0;

                while(i<=j && arr[i]==a)
                {
                    x++;
                    i++;
                }

                while(j>=i && arr[j]==b) {
                    y++;
                    j--;
                }

                count+=x*y;
            }
            else if(sum<target)
                i++;
            else
                j--;
        }

        return count;
    }
}