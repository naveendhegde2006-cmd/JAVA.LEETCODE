class Solution {
    public boolean isHappy(int n)
     {
        int s=0,d;
        while(n>1 && n!=4)
        {
            while(n!=0)
            {
                d=n%10;
                s=s+(d*d);
                n=n/10;
            }
            n=s;
            s=0;
        }
        return n==1;
    }
}