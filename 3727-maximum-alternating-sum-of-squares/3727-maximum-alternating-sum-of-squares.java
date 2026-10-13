import java.util.*;
class Solution {
    public long maxAlternatingSum(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=Math.abs(nums[i]);
        }
        long s=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length/2;i++)
        {
            s-=(long)nums[i]*(long)nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++)
        {
            s+=(long)nums[i]*(long)nums[i];
        }
        return s;
    }
}