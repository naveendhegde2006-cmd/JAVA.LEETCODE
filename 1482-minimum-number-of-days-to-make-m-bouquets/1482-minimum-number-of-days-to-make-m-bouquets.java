class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n=bloomDay.length;
        if((m*k)>n)
        return -1;
        int l=Integer.MAX_VALUE;
        int h=Integer.MIN_VALUE;
        for(int x:bloomDay)
        {
            l=Math.min(l,x);
            h=Math.max(h,x);
        }
        int ans=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(canb(mid,bloomDay,m,k))
            {
                ans=mid;
                h=mid-1;
            }
            else
            l=mid+1;
        }
        return ans;
    }
    private boolean canb(int mid,int[] bloomDay,int m,int k)
    {
        int b=0,c=0;
        for(int x:bloomDay)
        {
            if(x<=mid)
            {
            c++;
            if(c==k)
            {
            b++;
            c=0;
            }
            }
            else
            {
                c=0;
            }
        }
        return b>=m;
}
}