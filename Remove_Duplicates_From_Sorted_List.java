public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head,next=head;
    
        if(head==null)
           return head;
           
          while(next!=null)
          {
              if(prev.val!=next.val)
              {
                 prev.next = next;
                 prev=prev.next;
                 next=next.next;    
              }
              else
              {
                  next=next.next;
                  prev.next=null;
              }
              
          }
          return head;
    }
}
