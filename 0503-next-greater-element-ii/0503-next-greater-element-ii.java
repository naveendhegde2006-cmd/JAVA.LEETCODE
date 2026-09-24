class Solution {
    public int[] nextGreaterElements(int[] nums)
     {
        int n=nums.length;
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=2*n-1;i>=0;i--)
        {
            int num=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=num)
            stack.pop();
            if(i<n && !stack.isEmpty())
            ans[i]=stack.peek();
            stack.push(num);
        }
        return ans;
    }
}