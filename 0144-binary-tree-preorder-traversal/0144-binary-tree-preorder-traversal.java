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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        return helper(root,ans);
    }
    private List<Integer> helper(TreeNode root,List<Integer> ans){
        if(root==null){
            return ans;
        }else{
            ans.add(root.val);
            if(root.left!=null || root.right!=null){
                ans=helper(root.left,ans);
                ans=helper(root.right,ans);
            }
            return ans;
        }
    }
}