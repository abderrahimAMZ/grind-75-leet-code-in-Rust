//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();


        int coins[] = {2};
        int amount = 3;
        int result = solution.coinChange(coins, amount);

        System.out.println(result);


    }
}