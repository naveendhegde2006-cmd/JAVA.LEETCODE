class Solution {
    public boolean uniformArray(int[] nums1)
     {
        int minodd=Integer.MAX_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int num:nums1)
        {
            if(num%2==0)
            mineven=Math.min(mineven,num);
            else
            minodd=Math.min(minodd,num);
        }
        if(minodd==Integer.MAX_VALUE)
        return true;
        if(mineven==Integer.MAX_VALUE)
        return true;
        return minodd<mineven;
    }
}