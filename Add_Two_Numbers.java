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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem=0;

        ListNode result=null,head=null;
        
        while(l1!=null || l2!=null)
        {
            
            if(l1!=null)
            {
                rem+=l1.val;
                l1=l1.next;
            }
            
             if(l2!=null)
             {
                rem+=l2.val;
                l2=l2.next;
             }
          
           
            
            if(result==null)
            {
                head = result = new ListNode(rem%10);
            }
            else
            {
                result.next = new ListNode(rem%10);
                result=result.next;
            }
            
            rem/=10;
        }
        
         if(rem>0)
            result.next = new ListNode(rem);
        
     
        return head;
    }
}
