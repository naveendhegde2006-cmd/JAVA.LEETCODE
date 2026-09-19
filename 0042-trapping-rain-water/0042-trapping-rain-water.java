class Solution {
    public int trap(int[] height) 
    {
        int l=0,r=height.length-1;
        int lm=height[l],rm=height[r],water=0;
        while(l<r)
        {
            if(lm<rm)
            {
                l++;
                lm=Math.max(lm,height[l]);
                water+=lm-height[l];
            }
            else
            {
                r--;
                rm=Math.max(rm,height[r]);
                water+=rm-height[r];
            }
        }
        return water;
    }
}