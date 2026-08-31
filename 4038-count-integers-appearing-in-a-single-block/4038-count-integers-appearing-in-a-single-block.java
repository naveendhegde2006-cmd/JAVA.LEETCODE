class Solution {
    public int countSpecialIntegers(int[] nums) 
    {
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dis=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            {
                if(i==0||nums[i]!=nums[i-1])
                {
                    if(seen.contains(nums[i]))
                        dis.add(nums[i]);
                    else
                        seen.add(nums[i]);
            }
    }
        return seen.size()-dis.size();
}
}