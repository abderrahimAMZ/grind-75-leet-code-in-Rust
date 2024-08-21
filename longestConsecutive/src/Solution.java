import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;



class Solution {

    public int longestConsecutive(int[] nums) {
        // put the nums in a set
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int longest = 0;
        for (var num : nums) {
            if (!set.contains(num -1)) {

                int length = 0;

                while (set.contains(num + length)) {
                    length ++;
                }
                longest = Math.max(longest,length);
            }
        }
        return longest;

    }
}
