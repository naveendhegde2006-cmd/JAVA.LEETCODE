class Solution {
    public int calculate(String s)
     {
        Stack<Integer> stack=new Stack<>();
        char op='+';
        int num=0;
        for(int i=0;i<=s.length();i++)
        {
            char ch=(i==s.length())?'+':s.charAt(i);
            if(Character.isDigit(ch))
            num=num*10+ch-'0';
            else if(ch!=' ')
            {
                if(op=='+')
                stack.push(num);
                if(op=='-')
                stack.push(-num);
                if(op=='*')
                stack.push(stack.pop()*num);
                if(op=='/')
                stack.push(stack.pop()/num);
                op=ch;
                num=0;
            }
        }
        int ans=0;
        while(!stack.isEmpty())
        ans+=stack.pop();
        return ans;
    }
}