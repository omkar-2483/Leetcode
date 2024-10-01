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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        findDia(root);
        return maxDia;
    }
    
    private int maxDia = 0;
    
    private int findDia(TreeNode root){
        if (root == null) {
            return 0;
        }
        int leftDepth = findDia(root.left);
        int rightDepth = findDia(root.right);
        
        int currDia = leftDepth + rightDepth;
        // we are comparing the currDia with maxDia
        maxDia = Math.max(maxDia, currDia);


        // we are returing the max open path
        return 1 + Math.max(leftDepth, rightDepth); // pick one open path
    }
}