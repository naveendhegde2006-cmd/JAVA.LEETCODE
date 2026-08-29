class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
        int[] arr = new int[1001];
        for (int[] trip:trips) 
        {
            int passengers = trip[0];
            int from = trip[1];
            int to = trip[2];
            arr[from]+=passengers;
            arr[to]-=passengers;
        }

        int current=0;
        for (int i=0;i<=1000;i++) 
        {
            current+=arr[i];
            if (current>capacity) 
            {
                return false;
            }
        }
        return true;
    }
}