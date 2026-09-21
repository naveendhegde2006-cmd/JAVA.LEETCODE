class Solution {
    public int shipWithinDays(int[] weights, int days)
     {
        int l=0,h=0;
        for(int w:weights)
        {
            l=Math.max(l,w);
            h+=w;
        }
        int ans=0;
        while(l<=h)
        {
            int cap=l+(h-l)/2;
            if(isplace(weights,days,cap))
            {
                ans=cap;
                h=cap-1;
            }
            else
            l=cap+1;
        }
        return ans;
     }
    private boolean isplace(int weights[],int days,int cap)
    {
        int s=0,d=1;
        for(int w:weights)
        {
            s+=w;
            if(s>cap)
            {
                d++;
                s=w;
            }
        }
        return d<=days;
    }
}