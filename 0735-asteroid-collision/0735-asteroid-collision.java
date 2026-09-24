class Solution {
    public int[] asteroidCollision(int[] asteroids) 
    {
        Stack<Integer> stack=new Stack<>();
        for(int i:asteroids)
        {
            while(!stack.isEmpty() && i<0 && stack.peek()>0 && stack.peek()<-i)
            stack.pop();
            if(!stack.isEmpty() && i<0 && stack.peek()>0 )
            {
                if(stack.peek()==-i)
                stack.pop();
            }
            else
            stack.push(i);
        }
        int ans[]=new int[stack.size()];
        for(int i=ans.length-1;i>=0;i--)
        ans[i]=stack.pop();
        return ans;
    }
}