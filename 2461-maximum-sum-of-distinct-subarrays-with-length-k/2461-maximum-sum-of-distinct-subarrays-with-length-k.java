class Solution {
    public long maximumSubarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        long s=0,max=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        if(mp.size()==k)
        max=s;
        for(int i=k;i<nums.length;i++)
        {
            s+=nums[i];
            s-=nums[i-k];
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            mp.put(nums[i-k],mp.get(nums[i-k])-1);
            if(mp.get(nums[i-k])==0)
            mp.remove(nums[i-k]);
            if(mp.size()==k)
            max=Math.max(max,s);
        }
        return max;
    }
}