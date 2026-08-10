class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        int[] res=new int[2];
        int f=bs(nums,target,true);
        int l=bs(nums,target,false);
        res[0]=f;
        res[1]=l;
        return res;
    }
    static int bs(int arr[],int target,boolean isfirst)
    {
        int ans=-1;
        int l=0;
        int h=arr.length-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(arr[m]==target)
            {
                ans=m;
                if(isfirst)
                h=m-1;
                else
                l=m+1;
            }
            else if(arr[m]<target)
            l=m+1;
            else
            h=m-1;
        }
        return ans;
    }
    
}
    