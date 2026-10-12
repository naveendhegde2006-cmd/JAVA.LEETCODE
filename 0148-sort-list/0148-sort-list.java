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
 import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) 
    {
        List<Integer> list=new ArrayList<>();
        ListNode cur=head;
        while(cur!=null)
        {
            list.add(cur.val);
            cur=cur.next;
        }
        Collections.sort(list);
        int i=0;
        cur=head;
        while(cur!=null)
        {
            cur.val=list.get(i++);
            cur=cur.next;
        }
        return head;
    }
}