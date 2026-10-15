class Solution {
    public int sumCounts(List<Integer> nums) 
    {
        int ans=0;
        for(int i=0;i<nums.size();i++)
        {
            HashSet<Integer> map=new HashSet<>();
            for(int j=i;j<nums.size();j++)
            {
                map.add(nums.get(j));
                int c=map.size();
                ans+=c*c;
            }
        }
        return ans;
    }
}