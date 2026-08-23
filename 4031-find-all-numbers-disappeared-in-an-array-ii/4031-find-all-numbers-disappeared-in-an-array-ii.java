class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
       List<List<Integer>> res=new ArrayList<>();
        long cur=lower;
        Arrays.sort(nums);
        for(int num:nums)
            {
                if(num<cur)
                    continue;
                if(num>upper)
                    break;
                if(num>cur)
                    res.add(Arrays.asList((int) cur,num-1));
                cur=(long)num+1;
            }
        if(cur<=upper)
            res.add(Arrays.asList((int) cur,upper));
        return res;
    }
}