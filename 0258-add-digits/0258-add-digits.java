class Solution {
    public int addDigits(int num) 
    {
        int d,s=0;
        if(num<10)
        return num;
        else
        {
          while(num>9)
          {

            while(num!=0)
          {
            d=num%10;
            s=s+d;
            num=num/10;
        }
        num=s;
        s=0;
          }
   return num;
   }
}
}