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
    public List<String> binaryTreePaths(TreeNode root) {
        List <String> paths=new ArrayList<>();
        if(root==null){
            return paths;
        }
        
        StringBuilder path=new StringBuilder();
        buildPaths(root,path,paths);
        return paths;
    }
    
    private void buildPaths(TreeNode root,StringBuilder path,List<String> paths){
        if(root==null){
            return;
        }
        
        int initialLength=path.length();
        if(initialLength>0){
            path.append("->");
        }
        
        path.append(root.val);
        
        if(root.left==null && root.right==null){
            paths.add(path.toString());
        }else{
            buildPaths(root.left,path,paths);
            buildPaths(root.right,path,paths);
        }
        
        path.setLength(initialLength); //backtracking
    }
    
}
