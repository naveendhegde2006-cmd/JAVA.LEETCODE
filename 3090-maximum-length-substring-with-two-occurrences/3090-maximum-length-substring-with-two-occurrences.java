class Solution {
    public int maximumLengthSubstring(String s) {
        int ans = 0;
        for (int i=0;i<s.length();i++) 
        {
            int[] freq=new int[26];
            for (int j=i;j<s.length();j++) 
            {
                freq[s.charAt(j)-'a']++;
                if (freq[s.charAt(j)-'a']>2)
                    break;
                ans = Math.max(ans,j-i+1);
            }
        }
        return ans;
    }
}