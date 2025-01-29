/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                result.append(node.val + "$");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.append("#$");
            }
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strnode = data.split("\\$");
        if (strnode.length == 0 || strnode[0].equals("#")) {
            return null;
        }
        
        TreeNode root = new TreeNode(Integer.parseInt(strnode[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int i = 1;
        while (i < strnode.length) {
            TreeNode parent = queue.poll();

            if (!strnode[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.parseInt(strnode[i]));
                parent.left = left;
                queue.offer(left);
            }
            i++;

            if (i < strnode.length && !strnode[i].equals("#")) {
                TreeNode right = new TreeNode(Integer.parseInt(strnode[i]));
                parent.right = right;
                queue.offer(right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));