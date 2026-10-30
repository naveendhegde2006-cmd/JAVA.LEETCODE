class Solution {
    public int[] decrypt(int[] code, int k)
     {
        int[] z=new int[code.length];
        if(k==0)
        {
            return z;
        }
        else if(k>0)
        {
           for(int i=0;i<code.length;i++)
           {
            int c=0,s=0,j=(i+1)%code.length;
            while(c<k)
            {
               s+=code[j];
               c++;
               j=(j+1)%code.length;
            }
            z[i]=s;
           }
        }
        else
        {
            k=Math.abs(k);
           for(int i=0;i<code.length;i++)
           {
            int c=0,s=0,j=(i-1+code.length)%code.length;
            while(c<k)
            {
               s+=code[j];
               c++;
               j=(j-1+code.length)%code.length;
            }
            z[i]=s;
           }
        }
        return z;
    }
}