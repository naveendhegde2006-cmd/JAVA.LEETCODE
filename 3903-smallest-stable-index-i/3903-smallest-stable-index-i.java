class Solution {
    public int firstStableIndex(int[] nums, int k)
    {
        for(int i=0;i<nums.length;i++)
            {
                int max=nums[i];
                int min=nums[i];
                for(int j=0;j<=i;j++)
                    {
                        if(nums[j]>max)
                        {
                            max=nums[j];
                        }
                    }
                for(int l=i;l<nums.length;l++)
                    {
                        if(nums[l]<min)
                        {
                            min=nums[l];
                        }
                    }
                if((max-min)<=k)
                    return i;
            }
        return -1;
    }
}