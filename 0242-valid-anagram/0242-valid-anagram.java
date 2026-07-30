class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int[] m=new int[26];
        int i;
        for(i=0;i<s.length();i++)
        {
            m[s.charAt(i)-'a']++;
        }
        for(i=0;i<t.length();i++)
        {
            m[t.charAt(i)-'a']--;
        }
        for(i=0;i<26;i++)
        {
            if(m[i]!=0)
            return false;
        }
        return true;
    }
}