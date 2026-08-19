class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0;
        int cost=0;
        int ans=0;
        for (int right=0;right<s.length();right++) 
        {
            cost+=Math.abs(s.charAt(right)-t.charAt(right));
            while (cost>maxCost) 
            {
                cost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}