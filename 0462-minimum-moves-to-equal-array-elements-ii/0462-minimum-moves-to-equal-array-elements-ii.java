import java.util.*;
class Solution {
    public int minMoves2(int[] nums)
     {
        Arrays.sort(nums);
       int l=0;
       int h=nums.length-1;
       int ele=nums[(l+h)/2];
       int m=0;
       for(int i=0;i<nums.length;i++)
       {
        m+=Math.abs(nums[i]-ele);
       }
       return m;
    }
}