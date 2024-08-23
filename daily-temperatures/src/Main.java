












public class Main {
    public static void main(String[] args) {


        // test the code in the Solution class
        Solution solution = new Solution();

        int[] temperatures = {55,38,53,81,61,93,97,32,43,78};
        int[] results = solution.dailyTemperatures(temperatures);
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
        // expected output: 8 1 5 4 3 2 1 1 0 0




    }
}