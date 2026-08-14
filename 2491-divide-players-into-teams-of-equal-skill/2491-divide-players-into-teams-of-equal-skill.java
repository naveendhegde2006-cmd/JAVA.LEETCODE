import java.util.*;
class Solution {
    public long dividePlayers(int[] skill)
     {
        Arrays.sort(skill);
        int s=0;
        int e=skill.length-1;
        long ans=0;
        long ps=skill[s]+skill[e];
        while(s<e)
        {
            if((skill[s]+skill[e])!=ps)
            return -1;
            else
            {
                ans+=skill[s]*skill[e];
                s++;
                e--;
            }
        }
        return ans;
    }
}