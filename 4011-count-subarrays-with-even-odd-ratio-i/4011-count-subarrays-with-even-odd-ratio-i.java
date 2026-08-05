class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) 
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int oc=0;
            int ec=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                ec++;
                else
                oc++;
                if(oc>0 && (long)(ec*b)<=(long)(oc*a))
                ans++;
            }
        }
        return ans;

    }
}