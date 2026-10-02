class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50000];
        
        for (int x : nums) {
            freq[x]++;
        }

        int maxFreq = 0;

        for (int x : nums) {
            if (freq[x] > maxFreq) {
                maxFreq = freq[x];
            }
        }

        int ans = nums.length;

        for (int x : nums) {
            if (freq[x] == maxFreq) {
                int first = -1;
                int last = -1;

                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == x) {
                        if (first == -1)
                            first = i;
                        last = i;
                    }
                }

                ans = Math.min(ans, last - first + 1);
            }
        }

        return ans;
    }
}