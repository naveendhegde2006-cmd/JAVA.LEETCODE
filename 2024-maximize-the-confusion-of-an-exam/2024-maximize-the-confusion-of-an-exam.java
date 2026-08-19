class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans=0;
        int left=0;
        int t=0;
        int f=0;
        for (int right=0;right<answerKey.length();right++)
         {
            if (answerKey.charAt(right)=='T')
                t++;
            else
                f++;
            while (Math.min(t, f)>k) {
                if (answerKey.charAt(left)=='T')
                    t--;
                else
                    f--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}