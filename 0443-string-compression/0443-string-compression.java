class Solution {
    public int compress(char[] chars) 
    {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while (i<chars.length) 
        {
            char ch=chars[i];
            int count=0;
            while (i<chars.length && chars[i]==ch) 
            {
                count++;
                i++;
            }
            sb.append(ch);
            if (count>1) 
            {
                sb.append(count);
            }
        }
        for (int j=0;j<sb.length();j++) 
        {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}
