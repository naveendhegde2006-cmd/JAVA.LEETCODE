class Solution {
    public int minRange(int a, int b, int c)
     {
        int[] arr = {a, b, c};

        int[] lomirevatu = arr.clone();
        Arrays.sort(lomirevatu);
        int x = lomirevatu[0];
        int y = lomirevatu[1];
        int z = lomirevatu[2];
        return Math.min(z - x, y);
    }
}