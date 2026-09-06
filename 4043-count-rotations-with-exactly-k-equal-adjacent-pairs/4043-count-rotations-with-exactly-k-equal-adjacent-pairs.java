class Solution {
    public int countRotations(String s, int k) {
        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == s.charAt((i + 1) % n)) {
                total++;
            }
        }

        if (k == total - 1) {
            return total;
        }

        if (k == total) {
            return n - total;
        }

        return 0;
    }
}