class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for (int i=0;i<grid[0].length;i++) 
        {
            int max = 0;
            for (int j=0;j<grid.length;j++)
             {
                int x=grid[j][i];
                int c=0;
                if (x<=0)
                    c=1;
                while (x!=0) 
                {
                    x/=10;
                    c++;
                }

                max=Math.max(max,c);
            }
            ans[i]=max;
        }
        return ans;
    }
}