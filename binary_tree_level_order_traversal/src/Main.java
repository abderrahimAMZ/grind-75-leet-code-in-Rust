//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3,new TreeNode(4,new TreeNode(5),null),null),null),null);

        var result = solution.levelOrder(root);


        System.out.println(result);
    }
}