import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length -1;
        int water = 0;

        while (i < j) {


            if (height[i] <= height[j]) {
                int min = height[i];
                i++;
                while (i < j && min >= height[i]) {
                    int value = min - height[i];
                    water += value;
                    System.out.println(value);
                    i++;
                }
                while (i < j && height[i] <= height[i+1]) {
                    i++;
                }
            }
            else {
                int min = height[j];
                j--;
                while (j> i && min >= height[j]) {
                    int value = min - height[j];
                    water += value;
                    System.out.println(value);
                    j--;
                }
                while (j> i && height[j] <= height[j-1]) {
                    j--;
                }
            }
        }
        return water;
    }
}
