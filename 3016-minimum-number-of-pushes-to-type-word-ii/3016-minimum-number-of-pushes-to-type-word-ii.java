class Solution {
    public int minimumPushes(String word) 
    {
       int[] freq=new int[26];
       for(int i=0;i<word.length();i++)
       {
        freq[word.charAt(i)-'a']++;
       }
       int ans=0,push=1,count=0;
       Arrays.sort(freq);
       for(int i=25;i>=0;i--)
       {
        if(freq[i]==0)
        break;
        ans+=freq[i]*push;
        count++;
        if(count%8==0)
        push++;
       }
       return ans;
    }
}