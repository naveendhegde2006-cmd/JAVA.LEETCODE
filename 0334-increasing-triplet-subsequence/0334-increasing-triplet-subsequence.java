class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        int fs=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int x:nums)
        {
            if(x<=fs)
            fs=x;
            else if(x<=ss)
            ss=x;
            else
            return true;
        }
        return false;
    }
}