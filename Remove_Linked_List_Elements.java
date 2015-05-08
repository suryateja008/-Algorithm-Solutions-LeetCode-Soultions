/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null)
           return head;
           
        ListNode prev = null;
        ListNode temp = new ListNode(0);
        prev = temp;
         
        while(head!=null)
        {
           if(head.val!=val)
           {
               temp.next=head;
               temp=temp.next;
           }
           else
              temp.next=null;
              
               head=head.next;
        }
        return prev.next;
    }
}
