class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        if(k<=1)
        return 0;
        int l=0,p=1,c=0;
        for(int r=0;r<nums.length;r++)
        {
              p*=nums[r];
              while(p>=k)
              {
                p/=nums[l];
                l++;
              }
              c+=r-l+1;
        }
        return c;
    }
}