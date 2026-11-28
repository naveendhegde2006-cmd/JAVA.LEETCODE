class Solution {
    public int lastRemaining(int n) 
    {
        int h=1;
        int s=1;
        boolean l=true;
        while(n>1)
        {
            if(l||n%2==1)
            {
            h+=s;
            }
        n=n/2;
        s*=2;
        l=!l;
        }
        return h;
    }
}