class Solution {
    public int numberOfArithmeticSlices(int[] nums)
     {
        int c=0,ans=0;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i]-nums[i-1]==nums[i+1]-nums[i])
            c++;
            else
            c=0;
            ans+=c;
        }
      return ans;
    }
}