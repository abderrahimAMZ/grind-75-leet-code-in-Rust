//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int numCourses = 3;
        int[][] prerequisites = {{1,0},{2,0},{0,2}};
        boolean result = solution.canFinish(numCourses,prerequisites);

        System.out.println(result);


    }
}