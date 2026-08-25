import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        List<Integer> list=new ArrayList<>();
        for(int i:nums)
        list.add(i);
        int z=1;
        for(int i=k;i<=100000;i=k*z)
        {
            if(!list.contains(i))
            return i;
            z++;
        }
        return 100;
    }
}