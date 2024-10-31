import java.util.Stack;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Solution {


    class Tuple {
        // length of rec
        public int x;
        // height of rec
        public int y;

        Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Tuple merge(Tuple tuple) {
            return new Tuple(this.x + tuple.x, min(this.y, tuple.y));
        }

        public int surface() {
            return this.x * this.y;
        }
    }

    public int largestRectangleArea(int[] heights) {
        int lr = 0;

        Stack<Tuple> stack = new Stack<>();


        for (int i = heights.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                // we push something
                Tuple tuple = new Tuple(1, heights[i]);
                lr = max(lr, tuple.surface());
                stack.push(tuple);
            } else {
                Tuple tuple = new Tuple(1, heights[i]);
                lr = max(lr, tuple.surface());

                Tuple peek = stack.peek();
                lr = max(lr, peek.surface());


                if (tuple.y <= peek.y) {

                    boolean isMerged = false;

                    while (stack.size() >1 && stack.peek().y > heights[i]) {
                        peek = stack.pop();
                        lr = max(lr, peek.surface());

                        Tuple pop = stack.pop();
                        lr = max(lr, pop.surface());

                        if (pop.y < tuple.y) {
                            Tuple merge = peek.merge(tuple);
                            lr = max(lr, merge.surface());
                            stack.push(pop);
                            stack.push(merge);
                            isMerged = true;
                            break;
                        }




                        Tuple merged = peek.merge(pop);
                        lr = max(lr, merged.surface());
                        stack.push(merged);
                    }
                    if (isMerged) {
                        continue;
                    }
                    else if (stack.isEmpty()) {
                        stack.push(tuple);
                    }
                    else if (stack.peek().y >= tuple.y) {
                        Tuple pop = stack.pop();
                        lr = max(lr, pop.surface());

                        Tuple merged = pop.merge(tuple);
                        lr = max(lr, merged.surface());

                        stack.push(merged);
                    }
                    else {
                        stack.push(tuple);
                    }
                }
                else {
                    stack.push(tuple);
                }
            }
        }

        while (!stack.isEmpty()) {
            // we pop everything
            if (stack.size() == 1) {
                Tuple pop = stack.pop();
                lr = max(lr, pop.surface());
            } else {
                // we merge the last two
                Tuple peek = stack.pop();
                lr = max(lr, peek.surface());

                Tuple pop = stack.pop();
                lr = max(lr, pop.surface());

                Tuple merged = peek.merge(pop);
                lr = max(lr, merged.surface());

                stack.push(merged);
            }


        }

        return lr;
    }
}

