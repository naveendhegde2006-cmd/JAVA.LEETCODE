class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> list=new ArrayList<>();
        int i,d,z=1;
        for(i=left;i<=right;i++)
        {
            int k=i;
            while(k!=0)
            {
                d=k%10;
                if(d==0||i%d!=0)
                {
                    z=0;
                    break;
                }
                k=k/10;
            }
            if(z==1)
            list.add(i);
            z=1;
        }
        return list;
    }
}