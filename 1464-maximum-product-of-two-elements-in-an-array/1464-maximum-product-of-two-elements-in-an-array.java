class Solution {
    public int maxProduct(int[] nums) 
    {
        int i,j,max=0;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                if(((nums[i]-1)*(nums[j]-1))>max)
                max=(nums[i]-1)*(nums[j]-1);
            }
        }
        return max;
    }
}