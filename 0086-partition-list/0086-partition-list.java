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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;

        ListNode dummyLess = new ListNode(0);
        ListNode dummyGreater = new ListNode(0);
        ListNode less = dummyLess;
        ListNode greater = dummyGreater;

        while (head != null) {
            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        greater.next = null; // Set the end of greater list to null to avoid cycle
        less.next = dummyGreater.next; // Append the greater list to the end of less list

        return dummyLess.next;
    }
}