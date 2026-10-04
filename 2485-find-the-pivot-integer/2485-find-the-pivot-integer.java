class Solution {
    public int pivotInteger(int n) 
    {
        int l=1,h=n,ls=l,rs=h;
        if(n==1)
        return 1;
        while(l<h)
        {
            if(ls<rs)
            {
                l++;
                ls+=l;
            }
            else
            {
                h--;
                rs+=h;
            }
        }
        if(ls==rs)
        return l;
        else 
        return -1;
    }
}