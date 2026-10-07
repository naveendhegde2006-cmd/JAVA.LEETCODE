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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode c=head;
        int l=1;
        while(c.next!=null)
        {
            l++;
            c=c.next;
        }
        int p=l-n;
        if(p==0)
        return head.next;
        c=head;
        for(int i=1;i<p;i++)
        {
            c=c.next;
        }
        c.next=c.next.next;
        return head;
    }
}