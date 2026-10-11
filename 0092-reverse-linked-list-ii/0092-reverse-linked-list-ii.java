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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
       List<Integer> list=new ArrayList<>();
       ListNode cur=head;
       while(cur!=null)
       {
        list.add(cur.val);
        cur=cur.next;
       } 
       int i=left-1;
       int j=right-1;
       while(i<j)
       {
        int t=list.get(i);
        list.set(i,list.get(j));
        list.set(j,t);
        i++;
        j--;
       }
       cur=head;
       i=0;
       while(cur!=null)
       {
          cur.val=list.get(i++);
          cur=cur.next;
       }
       return head;
    }
}