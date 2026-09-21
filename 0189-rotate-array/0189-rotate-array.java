class Solution {
    public void rotate(int[] nums, int k)
     {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    private void reverse(int arr[],int l,int h)
    {
        while(l<h)
        {
            int t=arr[l];
            arr[l]=arr[h];
            arr[h]=t;
            l++;
            h--;
        }
    }
}