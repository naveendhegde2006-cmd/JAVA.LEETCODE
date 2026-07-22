class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] freq=new int[grid.length*grid.length+1];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                freq[grid[i][j]]++;
            }
        }
        int[] ans=new int[2];
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==2)
            {
                ans[0]=i;
            }
            else if(freq[i]==0)
            {
                ans[1]=i;
            }
        }
        return ans;
    }
}