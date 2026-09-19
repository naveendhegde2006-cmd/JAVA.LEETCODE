class Solution {
    public int longestOnes(int[] nums, int k)
     {
        int zc=0,m=0,l=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
            zc++;
            while(zc>k)
            {
                if(nums[l]==0)
                zc--;
                l++;
            }
            m=Math.max(m,r-l+1);
        }
        return m;
    }
}