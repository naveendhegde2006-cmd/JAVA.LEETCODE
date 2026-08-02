class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int g = gcd(nums[i], nums[j]);

                long x = nums[i] / g;
                long y = nums[j] / g;

                ans = Math.max(ans, x * y);
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}