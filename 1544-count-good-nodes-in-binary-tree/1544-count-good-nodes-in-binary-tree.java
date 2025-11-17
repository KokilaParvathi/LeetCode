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
    int count;
    void preorder(TreeNode node,int max){
        if(node == null) return;
        if(node.val >= max){
            count++;
            max = node.val;
        }

        preorder(node.left,max);
        preorder(node.right,max);
    }
    public int goodNodes(TreeNode root) {
        count = 0;
        preorder(root,root.val);

        return count;
    }
}