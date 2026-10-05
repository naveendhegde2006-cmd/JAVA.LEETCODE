import java.util.Arrays;
class Solution 
{
    public int deleteGreatestValue(int[][] grid) 
    {
        for (int[] row:grid) 
        {
            Arrays.sort(row);
        }

        int sum=0;
        for (int j = grid[0].length-1;j>=0;j--)
         {
            int max=0;
            for (int i=0;i<grid.length;i++) 
            {
                max = Math.max(max,grid[i][j]);
            }
            sum+=max;
        }
        return sum;
    }
}