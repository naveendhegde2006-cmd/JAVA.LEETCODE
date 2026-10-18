class Solution {
    public int[] lastVisitedCell(char[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int r=0,c=0;
        visited[r][c] = true;
        while (true) 
        {
            char ch=grid[r][c];
            int nr=r;
            int nc=c;
            if (ch=='L') 
            {
                nc--;
            } 
            else if (ch=='R') 
            {
                nc++;
            } 
            else if (ch=='U')
             {
                nr--;
            } 
            else if (ch=='D') 
            {
                nr++;
            }
            if (nr<0||nr>=m||nc<0||nc>=n||visited[nr][nc]) 
            {
                break;
            }
            r=nr;
            c=nc;
            visited[r][c]=true;
        }
        return new int[]{r, c};
    }
}