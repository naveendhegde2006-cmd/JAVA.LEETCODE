import java.util.Arrays;
class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
       int min=nums[0];
        int max=nums[nums.length-1];
        int flag;
        for(int i=min+1;i<max;i++)
        {
            flag=0;
            for(int j=1;j<nums.length-1;j++)
            {
                if(nums[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            list.add(i);
            
        }
        return list;
    }
}