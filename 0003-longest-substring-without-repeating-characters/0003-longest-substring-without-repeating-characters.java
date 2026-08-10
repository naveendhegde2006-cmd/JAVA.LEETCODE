class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];

        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }

        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (last[c] >= left) {
                left = last[c] + 1;
            }

            last[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}