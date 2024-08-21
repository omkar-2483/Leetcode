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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=findSize(head);
        ListNode[] ans= new ListNode[k];
        int partSize = size/k;
        ListNode temp=head;
        for(int i=0; i<k; i++){
            ans[i]=temp;
            if(i< size%k){
                for(int j=0; j< partSize; j++){
                    if(temp!=null) temp=temp.next;
                }
                if(temp!=null){ListNode next=temp.next;
                temp.next=null;
                temp=next;}

            }else{
                for(int j=0;j<partSize-1; j++){
                    if(temp!=null) temp=temp.next;
                }
                if(temp!=null){ListNode next=temp.next;
                temp.next=null;
                temp=next;}
            }
        }

        return ans;
    }

    public int findSize(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}