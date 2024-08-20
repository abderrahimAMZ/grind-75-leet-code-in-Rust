import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


class Solution {

    public int getGroup(int index) {
        return index/3  ;
    }
    public boolean isValidSudoku(char[][] board) {

        int n = board.length;


        // a lot of memory
        int[] encodingRows = new int[n];
        int[] encodingColumns = new int[n];
        int[][] encodingGroups = new int[n/3][n/3];


        for(int i =0 ; i<n ; i++) {

            for (int j =0 ; j< n ; j++) {

                int rowGroup = getGroup(i);
                int colGroup = getGroup(j);

                char value = board[i][j];

                int num = Character.getNumericValue(value);

                if (value == '.') {
                    continue;
                }


                else if (
                        ((encodingRows[i] & (1 << num)) >> num == 1) ||
                        ((encodingColumns[j] & (1 << num)) >> num == 1) ||
                        ((encodingGroups[rowGroup][colGroup] & (1 << num)) >> num == 1)
                )
                {
                    return false;
                }
                else {
                    encodingRows[i] |= 1 << num;
                    encodingColumns[j] |= 1 << num;
                    encodingGroups[rowGroup][colGroup] |= 1 << num;
                }
            }
        }

        return true;
    }
}
