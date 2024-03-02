
import java.util.*;
import java.util.stream.Collectors;

class Tuple {
    public int i;
    public int j;

    public Tuple(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {

    private Stack<Tuple> stack = new Stack<>();
    private boolean[][] isVisited;

    private int column_length = 0;

    private int row_length = 0;

    char[][] grid;
    public void dfs(int i, int j) {

        if (isVisited[i][j] == false) {
            isVisited[i][j] = true;
            Tuple piece_of_island = new Tuple(i, j);
            stack.add(piece_of_island);
        }
        if (i+1 < row_length && !isVisited[i+1][j] && grid[i+1][j] != '0') {
            dfs(i+1,j);
        }
        if (i - 1 >= 0  && !isVisited[i-1][j] && grid[i- 1][j] != '0') {
            dfs(i-1,j);
        }
        if (j+1 < column_length && !isVisited[i][j+1] && grid[i][j+1] != '0') {
            dfs(i,j+1);
        }
        if (j-1 >= 0 && !isVisited[i][j-1] && grid[i][j-1] != '0') {
            dfs(i,j-1);
        }
        else {
            if (stack.isEmpty()){
                return;
            }
            else {
                Tuple piece_of_land = stack.pop();
                dfs(piece_of_land.i,piece_of_land.j);
            }
        }
    }

    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.isVisited = new boolean[grid.length][grid[0].length];
        int number_of_islands = 0;
        row_length = grid.length;
        if (row_length == 0) {
            return number_of_islands;
        }
        else {
            column_length =grid[0].length;
        }

        for (int i=0;i<row_length;i++){
            for(int j=0; j<column_length;j++){
                if (grid[i][j] == '0'){
                    continue;
                }
                else if (isVisited[i][j]) {
                    continue;
                }
                else {
                    number_of_islands ++;
                    dfs(i,j);
                }
            }
        }

        return number_of_islands;


    }
}