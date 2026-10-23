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
    public ListNode detectCycle(ListNode head) {
        int count=0;
      
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next; 

            if(slow==fast){
                break;
            }
        }

        if(fast==null || fast.next==null){
            return null;
        }

        fast=head;

        while(slow!=fast  && fast!=null){
            fast=fast.next;
            slow=slow.next;
            // if(slow==fast){
            //     return fast;
            // }
        }

        return slow;
    }
}