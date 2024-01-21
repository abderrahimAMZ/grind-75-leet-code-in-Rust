//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums  = {-2,-1};
        int result = solution.maxSubArray(nums);

        System.out.printf("the result is %d",result);

    }
}