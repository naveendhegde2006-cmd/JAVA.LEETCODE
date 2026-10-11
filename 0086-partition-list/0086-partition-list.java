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
    public ListNode partition(ListNode head, int x) 
    {
       if(head==null)
       return null;
       List<Integer> list=new ArrayList<>();
       ListNode cur=head;
       while(cur!=null)
       {
        if(cur.val<x)
        list.add(cur.val);
        cur=cur.next;
       } 
       cur=head;
       while(cur!=null)
       {
        if(cur.val>=x)
        list.add(cur.val);
        cur=cur.next;
       } 
      cur=head;
      int i=0;
      while(cur!=null)
      {
        cur.val=list.get(i++);
        cur=cur.next;
      }
      return head;
    }
}