class Solution {
    public int maximumBeauty(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0;
        int r=0;
        int len=0;
        while (r < n) 
      { 
        while (nums[r]-nums[l]>2*k) 
        {
        l++;
        }
    len = Math.max(len,r-l+1);
    r++;
}

return len;
    }
}