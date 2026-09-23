class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int s=0,ml=-1;
        for(int n:nums)
        s+=n;
        int t=s-x;
        if(t==0)
        return nums.length;
        if(t<0)
        return -1;
        int l=0,to=0;
        for(int r=0;r<nums.length;r++)
        {
            to+=nums[r];
            while(to>t)
            to-=nums[l++];
            if(to==t)
            ml=Math.max(ml,r-l+1);
        }
        return ml==-1?-1:nums.length-ml;
    }
}