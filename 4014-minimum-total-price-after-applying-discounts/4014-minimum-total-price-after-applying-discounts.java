import java.util.*;

class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans = 0;
        int i = prices.length - 1;
        int j = discounts.length - 1;
        while (i >= 0 && j >= 0)
         {
            ans += prices[i] * (100.0 - discounts[j]) / 100.0;
            i--;
            j--;
        }
        while (i >= 0) 
        {
            ans += prices[i];
            i--;
        }
        return ans;
    }
}