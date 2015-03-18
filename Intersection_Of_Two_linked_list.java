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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA,second = headB;
        int c=0;
        
        while(headA!=null && headB!=null){
            
            if(headA==headB){
                return headA;
            }
            
            headA=headA.next;
            headB=headB.next;
            
            if(headB==null && c!=2){
               headB=first;
               c++;     
            }
              
            if(headA==null && c!=2){
               headA=second;
               c++;
            }
            
        }
        return null;
    }
}
