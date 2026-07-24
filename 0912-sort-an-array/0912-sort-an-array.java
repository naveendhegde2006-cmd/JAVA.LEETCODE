class Solution {
    public int[] sortArray(int[] nums)
     {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    void mergesort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    void merge(int[] arr,int l,int m,int r)
    {
        int i,j,k;
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for(i=0;i<n1;i++)
        L[i]=arr[l+i];
        for(j=0;j<n2;j++)
        R[j]=arr[m+1+j];
        j=0;
        i=0;
        k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k++]=L[i++];
            }
            else
            {
                arr[k++]=R[j++];
            }
        }
        while(i<n1)
        {
            arr[k++]=L[i++];
        }
        while(j<n2)
        {
            arr[k++]=R[j++];
        }
    }
}