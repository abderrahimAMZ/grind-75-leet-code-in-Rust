import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
        public int maxSubArray(int[] nums) {
            int array_length = nums.length;

            int i = 0;
            int j = 1;

            int sum_result = nums[i];
            int current_max = sum_result;

            while (j < array_length) {

                // we need to add elements one by one

                if (sum_result + nums[j] < nums[j]) {
                    sum_result = nums[j];
                    i = j;
                    j++;
                } else {
                    sum_result += nums[j];
                    j++;
                }


                if (sum_result - nums[i] > sum_result && i < j-1) {
                    sum_result = sum_result - nums[i];
                    i++;
                }

                if (sum_result > current_max) {
                    current_max = sum_result;
                }


            }
            return current_max;
        }

}
