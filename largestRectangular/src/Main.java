












public class Main {
    public static void main(String[] args) {


        // test the code in the Solution class
        Solution solution = new Solution();

        // test case 1
        int[] heights = {2,1,5,6,2,3};
        int result = solution.largestRectangleArea(heights);
        System.out.println(result); // 10

        // test case 2
        int[] heights2 = {2,4};
        int result2 = solution.largestRectangleArea(heights2);
        System.out.println(result2); // 4


        // test case 3
        int[] heights3 = {999,999,999,999};
        int result3 = solution.largestRectangleArea(heights3);
        System.out.println(result3); // 3996

        // test case 4
        int[] heights4 = {3,6,5,7,4,8,1,0};
        int result4 = solution.largestRectangleArea(heights4);
        System.out.println(result4); // 20












    }
}