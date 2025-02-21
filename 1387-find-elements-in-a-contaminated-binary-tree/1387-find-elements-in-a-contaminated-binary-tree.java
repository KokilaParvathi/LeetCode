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
class FindElements {
    private HashSet<Integer> set = new HashSet<>();

    private void fixTree(TreeNode root, int val) {
        if (root == null) return;
        root.val = val;
        set.add(val);
        fixTree(root.left, 2 * val + 1);
        fixTree(root.right, 2 * val + 2);
    }

    public FindElements(TreeNode root) {
        fixTree(root, 0);
    }

    public boolean find(int x) {
        return set.contains(x);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */