import java.util.ArrayList;
import java.util.Stack;

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

public static boolean isLeaf(TreeNode root){
    return (root.left == null && root.right == null);
}

public static void addLeftBoundary(TreeNode root, List<Integer> res){
    TreeNode curr = root.left;

    while(curr != null){
        if(!isLeaf(curr)){
            res.add(curr.val);
        }

        if(curr.left != null){
            curr = curr.left;
        }else{
            curr = curr.right;
        }
    }
}

public static void addLeaves(TreeNode root, List<Integer> res){
    if(root == null){
        return;
    }

    if(isLeaf(root)){
        res.add(root.val);
    }

    addLeaves(root.left, res);
    addLeaves(root.right, res);
}

public static void addRightBoundary(TreeNode root, List<Integer> res){
    TreeNode curr = root.right;

    Stack<Integer> stack = new Stack<>();

    while(curr != null){
        if(!isLeaf(curr)){
            stack.push(curr.val);
        }

        if(curr.right != null){
            curr = curr.right;
        }else{
            curr = curr.left;
        }
    }

    while(!stack.isEmpty()){
        res.add(stack.pop());
    }
}


public class boundaryTraversal{
    public List<Integer> boundaryTraversalOfTree(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }

        if(isLeaf(root)){
            res.add(root.val);
        }else{
            res.add(root.val);
            addLeftBoundary(root, res);
            addLeaves(root, res);
            addRightBoundary(root, res);
        }

        return res;
    }
}