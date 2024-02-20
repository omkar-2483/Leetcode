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
    public boolean isPalindrome(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        Stack<Integer> st=new Stack<>();
        temp=head;
        for(int i=0;i<length/2;i++){
            st.push(temp.val);
            temp=temp.next;
        }
        if(length%2!=0){
            temp=temp.next;
        }
        while(temp!=null){
            if(st.pop()!=temp.val)
                return false;
            temp=temp.next;
        }
        return true;
    }
}