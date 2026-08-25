class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        int n = aliceValues.length;
        Integer[] index=new Integer[n];
        for (int i=0;i<n;i++) 
        {
            index[i]=i;
        }

        Arrays.sort(index, (a, b) ->
            (aliceValues[b] + bobValues[b]) -
            (aliceValues[a] + bobValues[a])
        );

        int alice=0;
        int bob=0;
        for (int i=0;i<n;i++)
         {
            int stone = index[i];
            if (i % 2 == 0)
             {
                alice+=aliceValues[stone];
            }
             else 
            {
                bob+=bobValues[stone];
            }
        }
        if (alice > bob) return 1;
        if (alice < bob) return -1;
        return 0;
    }
}