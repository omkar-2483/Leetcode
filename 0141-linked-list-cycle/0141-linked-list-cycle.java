/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
//     public boolean hasCycle(ListNode head) {
//         HashMap<ListNode,Integer> map=new HashMap<>();
//         ListNode temp=head;
//         int index=0;
//         while(temp!=null){
//             if(map.containsKey(temp))
//                 return true;
//             else{
//                 map.put(temp,index);
//                 temp=temp.next;
//                 index++;
//             }
//         }
//         return false;
//     }

     // floyd's two pointer approach
     public boolean hasCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(slow!=null && fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}
