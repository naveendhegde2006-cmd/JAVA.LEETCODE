class Solution {
    public boolean isPalindromic(String s)
    {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray())
            {
                for(int i=7;i>=0;i--)
                    sb.append((c>>i)&1);
            }
        int l=0,r=sb.length()-1;
        while(l<r)
            {
                if(sb.charAt(l)!=sb.charAt(r))
                    return false;
                l++;
                r--;
            }
        return true;
    }
}