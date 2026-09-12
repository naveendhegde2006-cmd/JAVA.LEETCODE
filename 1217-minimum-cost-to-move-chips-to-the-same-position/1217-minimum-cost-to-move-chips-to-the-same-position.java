class Solution {
    public int minCostToMoveChips(int[] position) 
    {
        int ans = Integer.MAX_VALUE;
        for (int target:position)
         {
            int cost=0;
            for (int p:position) {
                if (Math.abs(p-target)%2==1)
                    cost++;
            }
            ans = Math.min(ans, cost);
        }
        return ans;
    }
}