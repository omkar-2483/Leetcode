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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans= new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q= new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            int levelSize= q.size();
            Double sum=0.0;
            for(int i=0; i<levelSize; i++){
                TreeNode curr= q.remove();
                sum+=curr.val;
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            ans.add(sum/levelSize);
        }
        return ans;   
    }
}