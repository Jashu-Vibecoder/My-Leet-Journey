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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            if(n==1){
                return null;
            }
        }
        
        int target=size(head)-n;
        if(target==0){
            head=head.next;
            return head;
        }
        
        ListNode node=head;
        ListNode d1=head;
        int count=0;

        while(d1.next!=null){
            
            if(count==target-1){
                d1.next=d1.next.next;
                return head;                
            }
            d1=d1.next;
            count++; 
        }
        return head;
        
    }
    public int size(ListNode head){
        
        int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}