class Solution {
    public boolean stoneGame(int[] piles) 
    {
        int i,count=0;
        for(i=0;i<piles.length;i++)
        {
            if(piles[i]%2!=0)
            {
                count++;
            }
        }
        if(count%2!=0)
        return true;
        else 
        return false;
    }
}