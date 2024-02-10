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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null || k==1)
                return head;
            temp=temp.next;
        }
        
        ListNode address=head;
        ListNode nextNode=new ListNode();
        temp=head.next;
        for(int i=1;i<k;i++){
            nextNode=temp.next;
            temp.next=address;
            address=temp;
            temp=nextNode;
        }
        head.next=reverseKGroup(nextNode,k);
        head=address;
        return head;
    }
}