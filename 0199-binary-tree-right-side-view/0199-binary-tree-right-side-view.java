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
    private class Info{
        TreeNode node;
        int depth;

        public Info(TreeNode node, int depth){
            this.node = node;
            this.depth=depth;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new LinkedList<>();
        if(root==null) return ans;
        
        Queue<Info> q= new LinkedList<>();
        HashMap<Integer, TreeNode> map= new HashMap<>();
        int maxDepth=0;

        q.add(new Info(root, 0));
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(!map.containsKey(curr.depth)){
                map.put(curr.depth, curr.node);
                maxDepth=curr.depth;
            }
            if(curr.node.right!=null){
                q.add(new Info(curr.node.right, curr.depth+1));
            }
             if(curr.node.left!=null){
                q.add(new Info(curr.node.left, curr.depth+1));
            }
        }

        for(int i=0; i<=maxDepth; i++){
            ans.add(map.get(i).val);
        }
        return ans;
    }
}