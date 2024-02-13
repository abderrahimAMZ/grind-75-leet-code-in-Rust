
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

class Solution {
    Stack<Integer> stack = new Stack<>();
    HashMap<Integer,Boolean> is_pushed_in_the_stack = new HashMap<>();
    HashMap<Integer,Boolean> is_taken = new HashMap<>();

    public boolean DPS_finish_course(int dependent_course,int num_prereq, int[][] prerequisites){

        boolean no_cycle = true;
        for ( int i = 0;i<num_prereq;i++) {
            if (dependent_course == prerequisites[i][0]) {

                stack.push(dependent_course);
                is_pushed_in_the_stack.put(dependent_course,true);
                int next_dependent_course = prerequisites[i][1];
                    if (is_pushed_in_the_stack.get(next_dependent_course) == true) {
                        return false;
                    }
                    else {
                        no_cycle = DPS_finish_course(next_dependent_course,num_prereq,prerequisites);

                    }


            }
        }
        if (no_cycle == false) {
            return false;
        }
        else {
            is_taken.put(dependent_course,true);
            while (stack.isEmpty() == false) {
                int course = stack.pop();
                is_taken.put(course,true);
                is_pushed_in_the_stack.put(course,false);
            }
            return true;

        }


    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean there_is_no_cycle = true;
        int prerequisites_length = prerequisites.length;
        for ( int i = 0;i<numCourses;i++) {
            is_taken.put(i,false);
            is_pushed_in_the_stack.put(i,false);

        }

        for (int i=0;i<prerequisites_length;i++) {
            int current_course = prerequisites[i][0];
            int dependent_course = prerequisites[i][1];
            if ( is_taken.get(current_course)) {
                continue;
            }
            else if (is_taken.get(dependent_course)) {
                is_taken.put(current_course,true);
            }
            else {
                stack.push(current_course);
                is_pushed_in_the_stack.put(current_course,true);
                there_is_no_cycle = DPS_finish_course(dependent_course,prerequisites_length,prerequisites);
                if (there_is_no_cycle == false) {
                    return false;
                }
            }


        }


        return there_is_no_cycle;
    }
}