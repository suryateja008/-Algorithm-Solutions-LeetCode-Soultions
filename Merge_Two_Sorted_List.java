public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return l1;
            
         if(l1!=null && l2==null)
            return l1;
            
          if(l1==null && l2!=null)
             return l2;
             
        ListNode temp = new ListNode(0);
        ListNode head=temp;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val>l2.val)
            {
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
            else
            {
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }
        }
        
        while(l1!=null)
        {
            temp.next=l1;
            temp=temp.next;
            l1=l1.next;
        }
        
        while(l2!=null)
        {
            temp.next=l2;
            temp=temp.next;
            l2=l2.next;
        }
        return head.next;
    }
}
