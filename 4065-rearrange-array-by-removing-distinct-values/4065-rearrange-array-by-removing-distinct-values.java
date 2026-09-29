class Solution {
    public int[] rearrangeArray(int[] nums)
     {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int n:nums)
         {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] ans=new int[nums.length];
        int index=0;
        while (!map.isEmpty()) 
        {
            List<Integer> remove=new ArrayList<>();
            for (int key:map.keySet()) 
            {
                ans[index++]=key;
                map.put(key,map.get(key)-1);
                if (map.get(key)==0)
                 {
                    remove.add(key);
                }
            }
            for (int key:remove) 
            {
                map.remove(key);
            }
        }
        return ans;
    }
}