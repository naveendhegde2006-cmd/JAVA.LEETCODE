import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int j=0;

        for (int i=1;i<=n&&j<target.length;i++) 
        {
            ans.add("Push");
            if (i==target[j]) 
            {
                j++;
            } 
            else 
            {
                ans.add("Pop");
            }
        }
        return ans;
    }
}
    
