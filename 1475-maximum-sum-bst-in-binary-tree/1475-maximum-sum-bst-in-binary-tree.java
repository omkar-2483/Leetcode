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
    public int maxSumBST(TreeNode root) {
        findBST(root);
        return maxSum;
    }

    public class Info{
        boolean isBST;
        int sum;
        int min;
        int max;
        public Info(boolean isBST, int sum, int min, int max){
            this.isBST=isBST;
            this.sum=sum;
            this.min=min;
            this.max=max;
        }
    }
    public int maxSum=0;

    private Info findBST(TreeNode root){
        //base case
        if(root==null){
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        //get Info for both subtrees
        Info left= findBST(root.left);
        Info right=findBST(root.right);
        int sum = left.sum + right.sum + root.val;
        int min = Math.min(root.val, Math.min(left.min, right.min));
        int max = Math.max(root.val, Math.max(left.max, right.max));

        //check for isBST
        if(root.val<=left.max || root.val >=right.min){
            return new Info(false, sum, min, max);
        }
        if(left.isBST && right.isBST){
            maxSum=Math.max(maxSum, sum);
            return new Info(true, sum, min, max);
        }
        return new Info(false, sum, min, max);
    }
}