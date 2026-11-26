class Solution {
    public boolean canAliceWin(int n)
     {
        if(n<10)
        return false;
        int z=10,c=0;
        while(n-z>=0)
        {
           n=n-z;
           z--;
           c++;
        }
        return c%2!=0;
    }
}