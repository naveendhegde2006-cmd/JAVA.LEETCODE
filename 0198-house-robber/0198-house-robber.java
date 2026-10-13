class Solution {
    public int rob(int[] nums) 
    {
        int es=0,os=0;
        for(int i=0;i<nums.length;i++)
        {
           int newrob=es+nums[i];
           int ne=Math.max(es,os);
           os=newrob;
           es=ne;
        }
        return Math.max(os,es);
    }
}