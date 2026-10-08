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
    public ListNode middleNode(ListNode head)
     {
        int l=0;
        ListNode c=head;
        while(c!=null)
        {
            l++;
            c=c.next;
        }
        int m=l/2;
        c=head;
        for(int i=0;i<m;i++)
        {
            c=c.next;
        }
        return c;
    }
}