class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) 
    {
        int min=Integer.MAX_VALUE,le=0;
        for(int i=0;i<nums.size();i++)
        {
            int s=0;
            for(int j=i;j<nums.size();j++)
            {
               s+=nums.get(j);
                le=j-i+1;
               if(le>=l && le<=r && s>0)
               min=Math.min(min,s);
               if(le>r)
               break;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}