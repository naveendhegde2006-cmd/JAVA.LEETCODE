import java.util.Scanner;
class Solution {
    public int minMoves(int[] nums) 
    {
        Arrays.sort(nums);
        int i,s=0;
        for(i=0;i<nums.length-1;i++)
        {
            s=s+(nums[nums.length-1]-nums[i]);
        }
        return s;
    }
}