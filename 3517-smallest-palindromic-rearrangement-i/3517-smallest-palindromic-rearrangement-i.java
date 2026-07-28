class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1)
                middle = (char) (i + 'a');

            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) (i + 'a'));
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(firstHalf);

        if (middle != 0)
            ans.append(middle);

        ans.append(new StringBuilder(firstHalf).reverse());

        return ans.toString();
    }
}