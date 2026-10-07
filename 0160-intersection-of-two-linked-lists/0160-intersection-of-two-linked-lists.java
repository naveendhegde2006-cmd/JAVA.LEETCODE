/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
     {
        int al=0,bl=0;
        ListNode a=headA;
        ListNode b=headB;
        while(a!=null)
        {
            al++;
            a=a.next;
        }
        while(b!=null)
        {
            bl++;
            b=b.next;
        }
        a=headA;
        b=headB;
        while(al>bl)
        {
            a=a.next;
            al--;
        }
        while(bl>al)
        {
            b=b.next;
            bl--;
        }
        while(a!=b)
        {
            a=a.next;
            b=b.next;
        }
        return a;
    }
}