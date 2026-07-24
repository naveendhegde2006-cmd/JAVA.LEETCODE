class Solution {
    public int diagonalPrime(int[][] nums) 
    {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(isprime(nums[i][i]))
            ans=Math.max(ans,nums[i][i]);
            if(isprime(nums[i][nums.length-1-i]))
            ans=Math.max(ans,nums[i][nums.length-1-i]);
        }
        return ans;
    }
    private boolean isprime(int n)
    {
        if(n<2)
        return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}