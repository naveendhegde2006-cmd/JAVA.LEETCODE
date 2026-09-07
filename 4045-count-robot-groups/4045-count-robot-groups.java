class Solution
 {
    public int countGroups(int[] position, int[] speed, int distance) 
    {
        int n=position.length;
        int ans=1;
        int right=n-1;
        for(int i=n-2;i>=0;i--)
        {
            if(position[i+1]-position[i]<=distance||speed[i]>speed[right])
            {
                continue;
            }
            ans++;
            right=i;
        }
        return ans;
    }
}