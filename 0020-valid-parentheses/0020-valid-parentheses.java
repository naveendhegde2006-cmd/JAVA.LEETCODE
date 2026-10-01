import java.util.Stack;
class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[')
            stack.push(c);
            else
            {
                if(stack.isEmpty())
                return false;
                char t=stack.pop();
                if((c==')' && t!='(')||(c=='}'&&t!='{')||(c==']'&&t!='['))
                return false;
            }
        }
        return stack.isEmpty();
    }
}