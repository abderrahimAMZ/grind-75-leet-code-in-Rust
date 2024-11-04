import java.util.Deque;
import java.util.PriorityQueue;

class Solution {
    class Tuple {
        public int value;
        public int index;

        Tuple(int value, int index) {
            this.value = value;
            this.index = index;
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Tuple> q = new PriorityQueue<Tuple>(k, (t1, t2) -> t2.value - t1.value);

        int[] result = new int[nums.length-k+1];

        int i = 0;
        int j = k-1;

        for (int v = 0; v<= j; v++) {
            q.add(new Tuple(nums[v],v));
        }

        while (j < nums.length) {

            while (q.peek().index < i) {
                q.poll();
            }
            result[i] = q.peek().value;
            i++;

            j++;
            if (j < nums.length) {
                q.add(new Tuple(nums[j], j));
            }
        }
        return result;

    }
}
