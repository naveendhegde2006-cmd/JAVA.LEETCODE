class Solution {
    public int scoreOfParentheses(String s) 
    {
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            stack.push(0);
            else
            {
                int val=stack.pop();
                int score=Math.max(2*val,1);
                stack.push(score+stack.pop());
            }
        }
        return stack.pop();
    }
}