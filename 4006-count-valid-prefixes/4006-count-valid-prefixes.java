class Solution {
    public int countValidPrefixes(String s)
     {
        int o=0,z=0,ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            z++;
            else
            o++;
            if(Math.abs(o-z)<=1)
            ans++;
        }
        return ans;
    }
}