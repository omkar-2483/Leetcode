/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         List<Integer> list=new ArrayList<>();
//         inorder(root, list);
//         for(int i=0;i<list.size()-1;i++){
//             if(list.get(i)>=list.get(i+1)) return false;
//         }
//         return true;

//     }
//     private void inorder(TreeNode root, List<Integer> list){
//         if(root==null) return;
//         inorder(root.left, list);
//         list.add(root.val);
//         inorder(root.right, list);
//     }
// }

// Method-2
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    
    private boolean isValidBST(TreeNode root, Integer low, Integer high) {
        if(root == null) {
            return true;
        }

        if((low != null && root.val <=low) || (high!=null && root.val>=high)) {
            return false;
        }
        return isValidBST(root.left, low, root.val) &&
        isValidBST(root.right, root.val, high);
    }
}