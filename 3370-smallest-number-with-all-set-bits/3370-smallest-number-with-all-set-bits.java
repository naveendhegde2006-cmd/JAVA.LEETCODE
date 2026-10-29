class Solution {
    public int smallestNumber(int n) 
    {
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a=(int)Math.pow(2,i);
            if(a>n)
            return a-1;
        }
        return -1;
    }
}