import java.util.*;
class Solution 
{
    public List<Integer> maxPrimes(int n, int s) 
    {
        List<Integer> ans=new ArrayList<>();
        int sum=0;
        for (int num=2;num<=n;num++) 
        {
            if (isPrime(num)) 
            {
                if (sum+num<= s) {
                    ans.add(num);
                    sum+=num;
                } 
                else 
                {
                    break;
                }
            }
        }
        return ans;
    }
    private boolean isPrime(int num)
     {
        for (int i=2;i*i<=num;i++) 
        {
            if (num%i==0) 
            {
                return false;
            }
        }
        return true;
    }
}
