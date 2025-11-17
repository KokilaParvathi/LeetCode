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
    void preorder(TreeNode node,List<Integer> list){
        if(node == null) return;
        list.add(node.val);
        preorder(node.left,list);
        preorder(node.right,list);
    }

    public int countNodes(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        preorder(node,list);
        return list.size();
    }
}