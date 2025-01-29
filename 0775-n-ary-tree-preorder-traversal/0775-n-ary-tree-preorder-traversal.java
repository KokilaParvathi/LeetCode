/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
      List<Integer> result = new ArrayList<>();
      preorderTraversal(root,result);
      return result; 
    }

      private void preorderTraversal(Node root,List<Integer> result ){
        if(root==null) return;
        result.add(root.val);

      for(int itr=0;itr<root.children.size();itr++)
        preorderTraversal(root.children.get(itr),result);
      }
    }