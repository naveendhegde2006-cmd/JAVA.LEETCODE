class Solution {
    public int sortPermutation(int[] nums)
     {
        int ans=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i==nums[i])
            continue;
            ans&=nums[i];
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}