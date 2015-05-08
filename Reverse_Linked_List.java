/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
          return head;
          
          ListNode prev = null,temp=null;
          
          while(head!=null)
          {
              temp = head.next;
              head.next = prev;
              prev = head;
              head=temp;
          }
          return prev;
    }
}
