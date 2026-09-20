class Solution {
    public int maxAbsoluteSum(int[] nums)
     {
        int ms=0,mis=0,cm=0,cmi=0;
        for(int num:nums)
        {
            cm=Math.max(num,cm+num);
            ms=Math.max(ms,cm);
            cmi=Math.min(num,cmi+num);
            mis=Math.min(mis,cmi);
        }
        return Math.max(ms,-mis);
    }
}