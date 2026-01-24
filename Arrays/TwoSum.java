import java.util.*
class Solution {
    public int[] twoSum(int[] nums, int target)
     {
    	int[] z=new int[2];
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        	{
        		if(nums[i]+nums[j]==target)
        		{
        			z[0]=i;
        			z[1]=j;
        			return z;
        		}
        	}
        		
        }
        return z;
    }
