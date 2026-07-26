import java.util.Scanner;
class Solution 
{
    public int maximumProduct(int[] nums) 
    {
       Arrays.sort(nums);
       int z=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
       int y=nums[0]*nums[nums.length-1]*nums[1];
       return Math.max(y,z);
        
    }
}