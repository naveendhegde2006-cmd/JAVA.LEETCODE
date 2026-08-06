class Solution {
    public boolean satisfiesConditions(int[][] grid)
     {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if((i+1<grid.length) && (grid[i+1][j]!=grid[i][j]))
                return false;
                if((j+1)<grid[i].length && (grid[i][j]==grid[i][j+1]))
                return false;
            }
        }
        return true;
    }
}