public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode first,second;
        first=second=head;
        
        if(first==null)
                  return null;
          
         while(first!=null || second!=null)
         {
             if(first.next==null || first.next.next==null)
                  return null;
                
             first=first.next.next;
             second=second.next;
             
             if(first==second)
                 break;
         }
         
         second = head;
         
         while(first!=second)
         {
             first=first.next;
             second = second.next;
         }
         return second;
        
    }
}
