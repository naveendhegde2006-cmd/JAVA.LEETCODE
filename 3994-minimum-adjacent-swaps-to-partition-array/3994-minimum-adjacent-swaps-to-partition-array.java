class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b)
    {
        long c1=0,c2=0,c3=0,ans=0,MOD=1000000007;
        for(int x:nums)
        {
            int l;
            if(x<a)
            l=0;
            else if(x<=b)
            l=1;
            else
            l=2;
            if(l==0)
            {
            ans+=c2+c3;
            c1++;
            }
            else if(l==1)
            {
            ans+=c3;
            c2++;
            }
            else 
            c3++;
        }
        return (int)(ans%MOD);
    }
}