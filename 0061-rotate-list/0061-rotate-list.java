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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next==null){
            return head;
        }

        int n=0;
        ListNode temp=head;
        ListNode last=null;
        while(temp!=null){
            last=temp;
            n++;
            temp=temp.next;
        }
   
        k=(k%n);
        if(k==0){
            return head;
        }

        last.next=head;
        ListNode newTail=head;
        for(int i=0;i<(n-k)-1;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;


        
        

        return newHead;
    }
}