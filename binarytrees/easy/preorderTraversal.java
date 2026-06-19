import java.util.*;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


public class preorderTraversal {
    public List<Integer> preorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }   

    private void traverse(TreeNode root, List<Integer> result){
        if(root == null) return;

        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
