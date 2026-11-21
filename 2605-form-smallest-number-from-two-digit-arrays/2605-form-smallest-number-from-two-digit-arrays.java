class Solution {
    public int minNumber(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int min1=10,min2=10;
        int[] freq=new int[10];
        for (int n:nums1) 
        {
            min1=Math.min(min1,n);
            freq[n]++;
        }
        for (int n:nums2) 
        {
            min2=Math.min(min2,n);
            if (freq[n]>0) 
            {
                return n;
            }
        }

        int a=Math.min(min1,min2);
        int b=Math.max(min1,min2);
        return a*10+b;
    }
}