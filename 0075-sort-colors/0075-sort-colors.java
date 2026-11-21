class Solution {
    public void sortColors(int[] nums) 
    {
        int[] freq=new int[3];
        int i;
        for(i=0;i<nums.length;i++)
        {
            freq[nums[i]%10]++;
        }
        int z=0;
        for(i=0;i<freq.length;i++)
        {
            for(int j=1;j<=freq[i];j++)
            {
                nums[z++]=i;
            }
        }
        
    }
}