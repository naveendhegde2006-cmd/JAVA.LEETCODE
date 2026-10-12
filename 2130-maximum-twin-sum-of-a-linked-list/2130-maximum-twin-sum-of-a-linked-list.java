/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) 
    {
        List<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            list.add(cur.val);
            cur=cur.next;
        }
        int i=0,j=list.size()-1,m=0;
        while(i<j)
        {
            int s=list.get(i)+list.get(j);
            m=Math.max(m,s);
            i++;
            j--;
        }
       return m;
    }
}