import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] c=new int[nums1.length+nums2.length];
        double me;
        int k=0,i,j,m;
        for(i=0;i<nums1.length;i++)
        {
            c[k]=nums1[i];
            k++;
        }
        for(j=0;j<nums2.length;j++)
        {
            c[k]=nums2[j];
            k++;
        }
        Arrays.sort(c);
        int l=0;
        int h=c.length-1;
        int n=c.length;
        if(n%2!=0)
        {
            m=(l+h)/2;
            me=c[m];
        }
        else
        {
            m=(l+h)/2;
            me=(c[m]+c[m+1])/2.0;
        }
        return me;

    }
}