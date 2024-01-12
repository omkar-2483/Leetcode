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
