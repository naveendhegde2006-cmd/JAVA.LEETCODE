import java.util.Scanner;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        if(arr.length==2)
        return true;
        for(int i=1;i<arr.length-1;i++)
        {
            if(d!=(arr[i+1]-arr[i]))
            return false;
        }
        return true;
    }
}