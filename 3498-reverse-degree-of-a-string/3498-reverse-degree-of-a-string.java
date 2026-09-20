class Solution {
    public int reverseDegree(String s) 
    {
        int su=0;
        for(int i=0;i<s.length();i++)
        {
            su=su+(('z'-s.charAt(i)+1)*(i+1));
        }
        return su;
    }
}