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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head==null || head.next==null || k==0)
        return head;
        ListNode cur=head;
        int l=1;
        while(cur.next!=null)
        {
            l++;
            cur=cur.next;
        }
        k=k%l;
        if(k==0)
        return head;
        cur.next=head;
        ListNode newc=head;
        int s=l-k;
        for(int i=1;i<s;i++)
        {
            newc=newc.next;
        }
        ListNode  nh=newc.next;
        newc.next=null;
        return nh;
    }
}