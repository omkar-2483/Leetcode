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
    // public boolean isPalindrome(ListNode head) {
    //     int length=0;
    //     ListNode temp=head;
    //     while(temp!=null){
    //         length++;
    //         temp=temp.next;
    //     }
    //     Stack<Integer> st=new Stack<>();
    //     temp=head;
    //     for(int i=0;i<length/2;i++){
    //         st.push(temp.val);
    //         temp=temp.next;
    //     }
    //     if(length%2!=0){
    //         temp=temp.next;
    //     }
    //     while(temp!=null){
    //         if(st.pop()!=temp.val)
    //             return false;
    //         temp=temp.next;
    //     }
    //     return true;
    // }


    //constant space complexity

    public boolean isPalindrome(ListNode head) {
        //base case
        if(head == null || head.next == null) return true;
        //find mid node
        ListNode Mid = findMidNode(head);

        //reverse second half
        ListNode prev = null;
        ListNode curr= Mid;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //check both halfs
        ListNode right = prev;
        ListNode left = head;
        while(right != null){
            if(right.val != left.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }


    public ListNode findMidNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}