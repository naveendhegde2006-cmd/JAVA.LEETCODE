class Solution {
    public int secondsToRemoveOccurrences(String s)
     {
        int t=0,z=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            z++;
            else if(z>0)
            t=Math.max(t+1,z);
        }
        return t;
    }
}