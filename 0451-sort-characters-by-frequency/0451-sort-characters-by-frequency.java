import java.util.*;

class Solution {
    public String frequencySort(String s) 
    {
        int[] freq=new int[128];
        for (char c:s.toCharArray()) 
        {
            freq[c]++;
        }
        List<Character> chars = new ArrayList<>();
        for (char c:s.toCharArray()) 
        {
            if (!chars.contains(c))
                chars.add(c);
        }
        chars.sort((a, b) -> freq[b]-freq[a]);
        StringBuilder ans = new StringBuilder();
        for (char c : chars) 
        {
            for (int i=0;i<freq[c];i++) 
            {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}