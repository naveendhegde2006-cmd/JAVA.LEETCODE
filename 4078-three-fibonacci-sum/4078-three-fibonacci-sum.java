class Solution 
{
    public boolean threeFibonacciSum(int n) 
    {
        
        int a=0,b=1;
        while (true) 
        {
            int c=a+b;
            int sum=a+b+ c;
            if (sum==n) 
            {
                return true;
            }
            if (sum>n) 
            {
                return false;
            }
            a = b;
            b = c;
        }
    }
}
