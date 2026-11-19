import java.util.*;
class Solution {
    public int minimizeSum(int[] nums) 
    {
        Arrays.sort(nums);
        int v1=nums[nums.length-3]-nums[0];
        int v2=nums[nums.length-2]-nums[1];
        int v3=nums[nums.length-1]-nums[2];
        return Math.min(v1,Math.min(v2,v3));
    }
}