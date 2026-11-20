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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1 = list1;
        ListNode h2 = list2;

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 != null && list2 == null) {
            return list1;
        } else if (list1 == null && list2 != null) {
            return list2;
        }

        ListNode n = new ListNode();
        ListNode dum = n;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                dum.next=list2;
                list2=list2.next;
            } else {
                dum.next = list1;
                list1=list1.next;
            }
            dum=dum.next;
        }
        dum.next=(list1 !=null) ? list1 : list2 ;

        return n.next;
    }
}