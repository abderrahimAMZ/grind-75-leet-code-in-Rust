
import java.util.*;



class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.empty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right;

        }
        return list;
    }

    public boolean isValidBST(TreeNode root) {

        List<Integer> stack = inorderTraversal(root);

        for (int i = 0; i < stack.size() - 1; i++) {
            if (stack.get(i) >= stack.get(i + 1)) {
                return false;
            }
        }

        return true;



    }
}