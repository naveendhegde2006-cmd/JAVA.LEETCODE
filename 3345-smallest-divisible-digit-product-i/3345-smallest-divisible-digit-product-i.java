class Solution {
    public int smallestNumber(int n, int t) 
    {
        int ans=n;
        for(int i=n;i<=100;i++)
        {
            int z=i,p=1;
            while(z!=0)
            {
                p*=z%10;
                z/=10;
            }
            if(p%t==0)
            return i;
        }
        return -1;
    }
}