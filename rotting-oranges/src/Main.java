import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Solution solution = new Solution();

        // i want the test that returns -1;
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};

        int result = solution.orangesRotting(grid);

        System.out.println(result);


    }
}