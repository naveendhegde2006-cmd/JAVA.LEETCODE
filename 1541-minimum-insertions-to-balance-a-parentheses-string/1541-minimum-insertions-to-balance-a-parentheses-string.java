class Solution {
    public int minInsertions(String s)
     {
        int ans=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            stack.push('(');
            else
            {
                if(i<s.length()-1 && s.charAt(i+1)==')')
                i++;
                else
                ans++;
                if(!stack.empty())
                stack.pop();
                else
                ans++;
            }
        }
        return ans+stack.size()*2;
    }
}