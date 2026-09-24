class Solution {
    public String decodeString(String s)
     {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num=0;

        for (char ch:s.toCharArray()) 
        {
            if (Character.isDigit(ch)) 
            {
                num=num*10+ch-'0';
            }
            else if (ch=='[') 
            {
                nums.push(num);
                strs.push(curr);
                num=0;
                curr=new StringBuilder();
            }
            else if (ch==']') 
            {
                int k=nums.pop();
                StringBuilder prev=strs.pop();
                for (int i=0;i<k;i++)
                    prev.append(curr);

                curr=prev;
            }
            else
             {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}