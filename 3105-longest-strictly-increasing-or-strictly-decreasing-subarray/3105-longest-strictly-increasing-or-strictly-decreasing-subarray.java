class Solution {
    public int longestMonotonicSubarray(int[] nums)
     {
       int in=1,d=1,a=1;
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]<nums[i+1])
        {
        in++;
        d=1;
        }
        else if(nums[i]>nums[i+1])
        {
        d++;
        in=1;
        }
        else
        {
            in=1;
            d=1;
        }
        a=Math.max(a,Math.max(in,d));
       }
       return a; 
    }
}