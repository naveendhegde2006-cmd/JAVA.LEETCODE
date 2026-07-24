class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int x=0,y=0;
        if(r*c!=m*n)
        return mat;
        int i,j;
        int[][] z=new int[r][c];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                z[x][y]=mat[i][j];
                y++;
                if(y==c)
                {
                    y=0;
                    x++;

                }
            }
        }
        return z;
        
    }
}