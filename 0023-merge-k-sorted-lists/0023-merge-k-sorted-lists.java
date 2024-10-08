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
    public ListNode mergeKLists(ListNode[] lists) {
        // Priority queue to store nodes in ascending order based on node value
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add all nodes from the lists to the priority queue
        for (ListNode list : lists) {
            ListNode temp = list;
            while (temp != null) {
                pq.add(temp);
                temp = temp.next;
            }
        }

        // If the queue is empty, return null
        if (pq.isEmpty()) {
            return null;
        }

        // Construct the result list from the priority queue
        ListNode res = pq.remove();
        ListNode temp = res;
        while (!pq.isEmpty()) {
            temp.next = pq.remove();
            temp = temp.next;
        }
        // Set the next of last node to null
        temp.next = null;

        return res;
    }
}
