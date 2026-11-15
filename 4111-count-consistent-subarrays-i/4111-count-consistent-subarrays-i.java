class Solution {
    public int countConsistent(int[] nums)
     {
        int count=0;
        for (int i=0;i<nums.length;i++) 
        {
            int and=nums[i];
            int min=nums[i];
            for (int j=i;j<nums.length;j++) 
            {
                and&=nums[j];
                min=Math.min(min, nums[j]);
                if (and==min) 
                {
                    count++;
                }
            }
        }
        return count;
    }
}