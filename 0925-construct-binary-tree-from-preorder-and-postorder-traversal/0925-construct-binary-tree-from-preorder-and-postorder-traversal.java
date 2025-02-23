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
    int pre, pos;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        pre=0;
        pos=0;
        return solve(preorder,postorder);
    }
    TreeNode solve(int[] preorder, int[] postorder) {
        TreeNode node = new TreeNode(preorder[pre]);

        if(preorder[pre]!=postorder[pos]){
            pre++;
            node.left = solve(preorder,postorder);
        }

        if(node.val!=postorder[pos]){
            pre++;
            node.right = solve(preorder,postorder);
        }
        
        pos++;
        return node;
    }
}