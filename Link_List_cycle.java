/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
          
        ListNode first=head.next,second=head;
        
        
        
        while(first!=null && second!=null)
        {
              if(first==second)
                   return true;
                   
                if(first.next==null)
                {
                    return false;
                }
                else
                {
                    first=first.next.next;
                }
                
                second=second.next;
           
        }
        
        return false;
        
    }
}
