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
    private boolean arecheck(TreeNode a,TreeNode b) {
        if(a==null && b==null)
        return true;
        if(a==null || b==null)
        return false;
        if(a.val!=b.val)
        return false;
        return arecheck(a.left,b.right) &&  arecheck(a.right,b.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;
        return arecheck(root.left,root.right);   
    }
}