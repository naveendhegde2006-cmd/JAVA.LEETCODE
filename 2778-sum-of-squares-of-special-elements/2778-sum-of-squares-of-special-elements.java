class Solution {
    public int sumOfSquares(int[] nums)
     {
        int s=0,i;
        for(i=0;i<nums.length;i++)
        {
            if(nums.length%(i+1)==0)
            s+=(nums[i]*nums[i]);
        }

      return s;  
    }
}