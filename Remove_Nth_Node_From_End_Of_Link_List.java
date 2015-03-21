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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int c=1;
        
        ListNode temp=head,prev=head,res=head;
        
        while(head.next!=null)
        {
            
            if(c>=n)
            {
                prev = temp;
                temp=temp.next;
            }
            head=head.next;
            c++;
        }
        
        if(temp==res)
          return res.next;
          
        prev.next = temp.next;
        
        
        return res;
        
    }
}
