/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]*/


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
class LinkedList1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode();
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode head3=ans;
        int carry=0;
        while(head1!=null && head2!=null){
            head3.val=(head1.val+head2.val+carry)%10;
            carry=(head1.val+head2.val+carry)/10;
            if(head1.next!=null || head2.next!=null || carry!=0){
                ListNode newNode=new ListNode();
                head3.next=newNode;
            }
            head1=head1.next;
            head2=head2.next;
            head3=head3.next;
        }
        while(head1!=null){
            head3.val=(head1.val+carry)%10;
            carry=(head1.val+carry)/10;
            if(head1.next!=null || carry!=0){
                ListNode newNode=new ListNode();
                head3.next=newNode;
            }
            head1=head1.next;
            head3=head3.next;
        }
        while(head2!=null){
            head3.val=(head2.val+carry)%10;
            carry=(head2.val+carry)/10;
            if(head2.next!=null || carry!=0){
                ListNode newNode=new ListNode();
                head3.next=newNode;
            }
            head1=head2.next;
            head3=head3.next;
        }
        if(carry!=0){
            head3.next=null;
            head3.val=carry;
        }
        return ans;
    }
}
