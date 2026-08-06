class Solution
 {
    public boolean checkValid(int[][] matrix) 
    {
        int n = matrix.length;
        for (int i = 0; i < n; i++)
         {
            boolean[] seen = new boolean[n + 1];
            for (int j = 0; j < n; j++) 
            {
                if (seen[matrix[i][j]])
                 {
                    return false;
                }
                seen[matrix[i][j]] = true;
            }
        }
        for (int j = 0; j < n; j++)
         {
            boolean[] seen = new boolean[n + 1];
            for (int i = 0; i < n; i++) 
            {
                if (seen[matrix[i][j]]) 
                {
                    return false;
                }
                seen[matrix[i][j]] = true;
            }
        }
        return true;
    }
}