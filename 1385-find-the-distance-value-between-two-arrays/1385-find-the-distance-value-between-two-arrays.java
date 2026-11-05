class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i,j,c,t=0;
        for(i=0;i<arr1.length;i++)
        {
            c=0;
            for(j=0;j<arr2.length;j++)
            {
                if((Math.abs(arr1[i]-arr2[j]))<=d)
                {
                c=1;
                break;
                }
            }
            if(c==0)
            t++;
        }
        return t;
    }
}