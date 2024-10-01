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
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh+rh, Math.max(ld, rd));
    }

    public int findHeight(TreeNode root){
        if(root==null) return 0;
        
        return (Math.max(findHeight(root.left), findHeight(root.right))+1);
    }
}