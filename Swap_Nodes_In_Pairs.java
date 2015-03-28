public class Solution {
    
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
            
        ListNode temp=head,prev=head;
        ListNode next=head.next;
        head=next;
        
        while(prev!=null && next!=null)
        {
            temp=next.next;
            prev.next=temp;
            next.next=prev;
            if(temp!=null && temp.next!=null)
               prev.next=temp.next;
            prev=temp;
            next=(prev!=null) ? prev.next : null;
        }
        return head;
    }
}
