class Solution {
    public int minSpeedOnTime(int[] dist, double hour)
     {
        int l=0,h=(int)1e7;
        int ans=-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(istravel(dist,hour,m))
            {
                ans=m;
                h=m-1;
            }
            else
            l=m+1;
        }
        return ans;
    }
    private boolean istravel(int[] dist,double h,int m)
    {
        double t=0.0;
        for(int i=0;i<dist.length;i++)
        {
            double ti=(double)dist[i]/m;
            if(i!=dist.length-1)
            {
                t+=Math.ceil(ti);
            }
            else
            t+=ti;
        }
        return t<=h;
    }
}