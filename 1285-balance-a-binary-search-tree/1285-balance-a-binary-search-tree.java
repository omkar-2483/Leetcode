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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<TreeNode> list =  new ArrayList<>();
        findInorder(root, list);
        return sortedArrayToBST(list,0,list.size()-1);
    }
    private void findInorder(TreeNode root, ArrayList<TreeNode> list){
        if(root==null) return;
        findInorder(root.left, list);
        list.add(root);
        findInorder(root.right, list);
    }
    private TreeNode sortedArrayToBST(ArrayList<TreeNode> list, int l, int h){
        if(l>h) return null;
        int mid=l+(h-l)/2;
        TreeNode root= list.get(mid);
        root.left= sortedArrayToBST(list, l, mid-1);
        root.right=sortedArrayToBST(list, mid+1, h);
        return root;
    }
}