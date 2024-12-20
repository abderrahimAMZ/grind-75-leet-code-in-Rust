
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;

        int r = nums.length -1;

        int mid = 0;




        while (l <= r ) {

            mid = l + (r-l) /2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[l] > nums[mid]) {
                if (target < nums[mid] || target >= nums[l]) {
                    r = mid -1;
                }
                else {
                    l = mid +1;
                }
            }
            else {
                if ( target >= nums[l] && target < nums[mid]) {
                    r = mid -1;
                }
                else {
                    l = mid +1;
                }
            }

        }


        return -1;
    }
}