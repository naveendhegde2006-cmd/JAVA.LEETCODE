class Solution {
    public int evalRPN(String[] tokens)
     {
        int[] s=new int[100000];
        int top=-1,op1,op2;
        for(int i=0;i<tokens.length;i++)
        {
           String token=tokens[i];
           switch(token)
           {
            case "+":op1=s[top--];
                     op2=s[top--];
                     s[++top]=op2+op1;
                     break;
            case "-":op1=s[top--];
                     op2=s[top--];
                     s[++top]=op2-op1;
                     break;
            case "*":op1=s[top--];
                     op2=s[top--];
                     s[++top]=op2*op1;
                     break;
            case "/":op1=s[top--];
                     op2=s[top--];
                     s[++top]=op2/op1;
                     break;
            default:s[++top]=Integer.parseInt(token);
           }
        }
        return s[top]--;
    }
}