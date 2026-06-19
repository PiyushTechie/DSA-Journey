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

public class inorderTraversal {
    public List<Integer> inorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }   

    private void traverse(TreeNode root, List<Integer> result){
        if(root == null) return;

        traverse(root.left, result);
        result.add(root.val);
        traverse(root.right, result);
    }
}
