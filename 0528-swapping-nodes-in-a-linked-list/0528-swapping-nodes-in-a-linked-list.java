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
    public ListNode swapNodes(ListNode head, int k) {
        int size= 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp=temp.next;
        }

        ListNode start=head;
        ListNode end=head;
        for(int i=1; i<k;i++){
            start=start.next;
        }

        //kth node from end = size-k+1th node from start
        for(int i=1; i<size-k+1;i++){
            end=end.next;
        }

        //swap
        int Temp=start.val;
        start.val=end.val;
        end.val=Temp;

        return head;
    }
}