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
    public void check(TreeNode left, TreeNode right, int level) {
        if (left == null || right == null) return;
        if (level % 2 == 1) {
            int t = left.val;
            left.val = right.val;
            right.val = t;
        }

        check(left.left, right.right, level + 1);
        check(left.right, right.left, level + 1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) return null;
        check(root.left, root.right, 1);

        return root;
    }
}