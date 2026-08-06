class Solution {
    public boolean checkXMatrix(int[][] grid) 
    {
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(((i==j)||(j==grid.length-1-i))&&grid[i][j]==0)
                return false;
                if(((i!=j)&&(j!=grid.length-1-i))&&grid[i][j]!=0)
                return false;
            }
        }
        return true;
    }
}