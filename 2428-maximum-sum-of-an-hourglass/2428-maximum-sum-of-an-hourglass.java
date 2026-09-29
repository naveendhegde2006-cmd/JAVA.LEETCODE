class Solution {
    public int maxSum(int[][] grid) 
    {
        int s=0,m=0;
        for(int i=0;i<=grid.length-3;i++)
        {
            s=0;
           for(int j=0;j<=grid[0].length-3;j++)
           {
            s=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
             m=Math.max(s,m);
           }

        }
        return m;

    }
}