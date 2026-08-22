class Solution {
    public boolean checkDivisibility(int n)
     {
        int z=n,s=0,m=1;
        while(z!=0)
        {
            int d=z%10;
            s+=d;
            m*=d;
            z/=10;
        }
        return n%(s+m)==0;
        
    }
}