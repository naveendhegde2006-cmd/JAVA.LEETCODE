class Solution {
    public String firstPalindrome(String[] words) 
    {
        int i,j;
        for(i=0;i<words.length;i++)
        {
            for(j=0;j<(words[i].length()/2);j++)
            {
                if(words[i].charAt(j)!=words[i].charAt(words[i].length()-1-j))
                break;
            }
            if(j==(words[i].length()/2))
                return words[i];
        }
        return "";
    }
}