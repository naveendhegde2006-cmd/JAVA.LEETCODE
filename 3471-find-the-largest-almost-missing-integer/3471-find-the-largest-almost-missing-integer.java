class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        if (k == n) {
            int ans = -1;

            for (int x : nums) {
                ans = Math.max(ans, x);
            }

            return ans;
        }

        int[] freq = new int[51];

        for (int x : nums) {
            freq[x]++;
        }

        if (k == 1) {
            int ans = -1;

            for (int x : nums) {
                if (freq[x] == 1) {
                    ans = Math.max(ans, x);
                }
            }

            return ans;
        }

        int ans = -1;

        if (freq[nums[0]] == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (freq[nums[n - 1]] == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}