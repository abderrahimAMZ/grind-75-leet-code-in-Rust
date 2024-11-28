class Solution {
    public boolean isCopy(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        else if ( root == null && subRoot != null || root != null && subRoot == null) {
            return false;
        }
        else {
            return root.val == subRoot.val && isCopy(root.left, subRoot.left) && isCopy(root.right, subRoot.right);
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        else if ( root == null && subRoot != null || root != null && subRoot == null) {
            return false;
        }

        else {
            return isCopy(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

    }
}
