class Solution {
    public int findTheLongestBalancedSubstring(String s) 
    {
        int max=0;
        int i=0;
        while (i<s.length()) 
        {
            int zero=0,one=0;
            while (i<s.length()&&s.charAt(i)=='0') 
            {
                zero++;
                i++;
            }
            while (i<s.length() && s.charAt(i)=='1') 
            {
                one++;
                i++;
            }
            max = Math.max(max, 2*Math.min(zero, one));
        }
        return max;
    }
}