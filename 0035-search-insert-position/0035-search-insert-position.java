import java.util.Scanner;
import java.util.Arrays;
class Solution
 {
    public int searchInsert(int[] nums, int target)
     {
        int pos=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                pos=i;
                break;
            }
            else
            {
                if(target<nums[i])
                {
                    pos=i;
                    break;
                }
            }
        }
        if(pos>=0)
        {
            return pos;
        }
        else
          {
            return nums.length;
          }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter sorted array:");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Target:");
        int t=sc.nextInt();
        Solution s=new Solution();
        System.out.println("Result:" + (s.searchInsert(a,t)));
    }
}