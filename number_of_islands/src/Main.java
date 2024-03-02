import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // i want to test this one
        // [["1","1","1","1","1","1","1","1","1"],["1","0","0","0","0","0","0","0","1"],["1","0","1","0","1","0","1","0","1"],["1","0","1","1","1","1","1","0","1"],["1","0","1","0","1","0","1","0","1"],["1","0","0","0","0","0","0","0","1"],["1","1","1","1","1","1","1","1","1"]]


        Solution solution = new Solution();
        char[][] grid = new char[][]{
                {'1','1','1','1','1','1','1','1','1'},
                {'1','0','0','0','0','0','0','0','1'},
                {'1','0','1','0','1','0','1','0','1'},
                {'1','0','1','1','1','1','1','0','1'},
                {'1','0','1','0','1','0','1','0','1'},
                {'1','0','0','0','0','0','0','0','1'},
                {'1','1','1','1','1','1','1','1','1'}
        };
        int result = solution.numIslands(grid);

        System.out.println(result);


    }
}