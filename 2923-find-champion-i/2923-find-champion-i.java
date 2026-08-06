class Solution {
    public int findChampion(int[][] grid)
     {
        int s=0;
        for(int i=0;i<grid.length;i++)
        {
            boolean lost=false;
            for(int j=0;j<grid[i].length;j++)
            {
                if((i!=j)&&grid[j][i]==1)
                {
                lost=true;
                break;
                }
            }
            if(!lost)
            return i;
        }
        return -1;
    }
}