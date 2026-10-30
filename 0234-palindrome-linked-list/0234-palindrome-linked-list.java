/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // slow is now in middle & Slow === new head
        ListNode d1=null;
        ListNode d2=null;
        
        while(slow!=null){
            d2=slow;
            slow=slow.next;
            d2.next=d1;
            d1=d2;
        }
        // ListNode new=d1; 
        while(head!=null && d1!=null){
            if(head.val!=d1.val){
                return false;
            }
            head=head.next;
            d1=d1.next;
        }
        return true;
    }
}