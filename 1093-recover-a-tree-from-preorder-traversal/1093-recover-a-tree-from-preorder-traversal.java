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
    int i=0;
    public TreeNode recoverFromPreorder(String traversal) {
        return solve(traversal, i, 0);
    }
    private TreeNode solve(String s, int i, int depth)
    {
        if(i>=s.length()) return null;
        int j=i;
        while(j<s.length() && s.charAt(j)=='-')
        {
            j++;
        }
        int dash=j-i;
        if(dash!=depth) return null;
        i=j;
        int num=0;
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            num=(num*10)+(s.charAt(i)-'0');
            i++;
        }
        TreeNode root=new TreeNode(num);
        this.i=i;
        root.left=solve(s, this.i, depth+1);
        root.right=solve(s, this.i, depth+1);
        return root;
    }
}