class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int count=0;
        for (int i=0;i<=s.length()-k;i++) 
        {
            int value=Integer.parseInt(s.substring(i,i+k));
            if (value!=0 && num%value==0) 
            {
                count++;
            }
        }
        return count;
    }
}