
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
    public void bfs(int i, int j) {

    }
    public int orangesRotting(int[][] grid) {
        int row_length = grid.length;
        int column_length = grid[0].length;
        boolean[][] isVisited = new boolean[row_length][column_length];
        int result = 0;
        int number_of_minutes = 0;
        int[] rotation = {1, 0, -1, 0, 1};

        int number_of_oranges_in_queue = 1;

        ArrayDeque<Tuple> queue = new ArrayDeque<>();
        for (int i = 0; i<row_length;i++) {
            for ( int j = 0; j< column_length; j++) {
                if (grid[i][j] == 0  || isVisited[i][j])  {
                    continue;
                }
                else if (grid[i][j] == 1) {

                    boolean isSroundedByRotten = false;
                    for (int rot = 0; rot < 4; rot++) {
                        int index_i = i + rotation[rot];
                        int index_j = j + rotation[rot + 1];

                        if (index_i >= 0 && index_i < row_length && index_j >= 0 && index_j < column_length && grid[index_i][index_j] == 2) {
                            isSroundedByRotten = true;
                        }

                    }
                    if (!isSroundedByRotten){
                        return -1;
                    }
                    else {
                        continue;
                    }

                }
                else {
                    Tuple rotten_orange = new Tuple(i,j);
                    queue.add(rotten_orange);


                    while (queue.isEmpty() == false) {

                        int stage = number_of_oranges_in_queue;
                        number_of_oranges_in_queue = 0;

                        for (int search = 0; search < stage; search++) {

                            Tuple output = queue.pop();

                            for (int rot = 0; rot < 4; rot++) {
                                int index_i = output.i + rotation[rot];
                                int index_j = output.j + rotation[rot + 1];

                                if (index_i >= 0 && index_i < row_length && index_j >= 0 && index_j < column_length && grid[index_i][index_j] == 1) {
                                    grid[index_i][index_j] = 2;
                                    isVisited[index_i][index_j] = true;
                                    queue.add(new Tuple(index_i,index_j));
                                    number_of_oranges_in_queue++;

                                }

                            }


                        }
                        number_of_minutes ++;
                    }
                    result = Math.max(result,number_of_minutes);
                    number_of_minutes = 0;
                }

            }
        }

        if (result == 0) {
            return 0;
        }

        return result -1;
    }
}