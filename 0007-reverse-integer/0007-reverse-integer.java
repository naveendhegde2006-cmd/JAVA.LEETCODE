class Solution
{
    public int reverse(int x)
     {
        
        int rev=0;
        while(x!=0)
        {
            int d=x%10;
            x=x/10;
        if (rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10)
        {
            return 0;
        }
        rev=rev*10+d;
    }
    return rev;
     }
    public static void main()
    {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       n=sc.nextInt();
       Solution ms=new Solution();
       System.out.println("Reversed: "+ ms.reverse(n));
       sc.close();
    }
}