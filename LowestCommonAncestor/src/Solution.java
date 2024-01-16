
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;
        int p_val = p.val;
        int q_val = q.val;
        int root_val = root.val;
        if (p_val > root_val && q_val > root_val) {
            return lowestCommonAncestor(root.right, p, q);

        }
        else if (p_val < root_val && q_val < root_val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        else {
            return root;
        }
    }
}
