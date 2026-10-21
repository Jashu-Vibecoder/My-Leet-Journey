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
    public ListNode reverseList(ListNode head) {
        ListNode node=head;
        ListNode d1=null;
        ListNode d2=null;
        while(head!=null){
            d2=head;
            head=head.next;
            d2.next=d1;
            d1=d2;
        }
        // head.next=d2;
        

        return d1;
    }
}