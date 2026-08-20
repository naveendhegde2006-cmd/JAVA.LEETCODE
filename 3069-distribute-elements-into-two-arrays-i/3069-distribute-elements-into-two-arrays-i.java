class Solution {
    public int[] resultArray(int[] nums)
     {
        int[] z=new int[nums.length];
        int[] y=new int[nums.length];
        z[0]=nums[0];
        y[0]=nums[1];
        int j=1,k=1,i;
        for(i=2;i<nums.length;i++)
        {
            if(z[j-1]>y[k-1])
            {
                z[j++]=nums[i];
            }
            else
            {
                y[k++]=nums[i];
            }
        }
        int c=0;
        for(i=0;i<nums.length;i++)
        {
            if(z[i]!=0)
            {
                nums[i]=z[i];
                c++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(y[i]!=0)
            {
                nums[c++]=y[i];
            }
        }
        return nums;

    }
}