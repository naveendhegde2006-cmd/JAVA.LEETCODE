class Solution {
    public String removeKdigits(String num, int k) 
    {
        StringBuilder sb=new StringBuilder();
        for(char ch:num.toCharArray())
        {
            while(k>0 && sb.length()>0 && sb.charAt(sb.length()-1)>ch)
            {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(ch);
        }
        sb.setLength(sb.length()-k);
        int start=0;
        while(start<sb.length() && sb.charAt(start)=='0')
        {
            start++;
        }
        String ans=sb.substring(start);
        return ans.isEmpty() ? "0" : ans;
    }
}