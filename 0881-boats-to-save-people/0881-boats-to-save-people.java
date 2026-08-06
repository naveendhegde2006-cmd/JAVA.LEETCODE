import java.util.Arrays;
class Solution {
    public int numRescueBoats(int[] people, int limit)
     {
        int c=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<=j)
        {
            if(people[i]+people[j]<=limit)
            i++;
            j--;
            c++;
        }
        return c;
    }
}