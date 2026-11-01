class Solution {
    public int minMergedInteger(int[] nums) 
    {
        int ans=Integer.MAX_VALUE;

        for (int i=0;i<nums.length;i+=2) 
        {
            int merged=Integer.parseInt(
                String.valueOf(nums[i])+nums[i + 1]
            );
            ans=Math.min(ans, merged);
        }
        return ans;
    }
}