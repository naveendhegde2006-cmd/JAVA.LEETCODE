class Solution {
    public String[] assignUmbrella(int[] rain)
     {
        int bc=0,ac=0;
        String[] a=new String[rain.length];
        for(int i=0;i<rain.length-1;i++)
        {
            if(rain[i]==1 && rain[i+1]==1 && ac<=bc)
            {
            a[i]="Alice";
            ac++;
            }
            else if(rain[i]==1)
            {
            a[i]="Bob";
            bc++;
            }
            else
            a[i]="None";
        }
        if(rain[rain.length-1]==1)
        a[rain.length-1]="Bob";
        else
        a[rain.length-1]="None";
        return a;
    }
}