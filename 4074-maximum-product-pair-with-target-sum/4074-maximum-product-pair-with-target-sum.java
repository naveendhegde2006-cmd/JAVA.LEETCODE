class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] z={-1, -1};
        int mp=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++) 
        {
            for (int j=0;j<nums.length;j++) 
            {
                if (i!=j && nums[i]+nums[j]==target &&
                    nums[i]>nums[j] && nums[i]*nums[j]>mp) 
                {
                    mp=nums[i]*nums[j];
                    z[0]=i;
                    z[1]=j;
                }
            }
        }
        return z;
    }
}