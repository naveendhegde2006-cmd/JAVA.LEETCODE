class Solution {
    public int minOperations(String s) {
        int n = s.length();
        boolean sorted = true;

        char min = s.charAt(0);
        char max = s.charAt(0);

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if (c < s.charAt(i - 1)) {
                sorted = false;
            }

            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        // Case 1: Already sorted
        if (sorted) {
            return 0;
        }

        // Case 2: Impossible to sort
        if (n == 2) {
            return -1;
        }

        // Case 3: One operation is sufficient
        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        // Case 4: Minimum or maximum is in the middle
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        // Case 5: Otherwise, three operations
        return 3;
    }
}