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
    public void reorderList(ListNode head) {
        //base case
        if(head==null || head.next==null || head.next.next==null) return;
        
        //find mid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse second half
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode Rhead=prev;

        //merge two halfs
        ListNode nextR,nextL;
        while(head!=null && Rhead!=null){
            nextL=head.next;
            nextR=Rhead.next;
            head.next=Rhead;
            Rhead.next=nextL;

            head=nextL;
            Rhead=nextR;
        }
    }
}