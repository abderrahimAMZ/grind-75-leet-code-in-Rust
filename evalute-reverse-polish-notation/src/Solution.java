
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;


class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int first_operand;
        int second_operand;
        int result;
        int string_length = tokens.length;

        for (int i = 0; i< string_length; i++) {
            String character = tokens[i];
            switch (character) {
                case "+":
                    first_operand = (int)stack.pop();
                    second_operand = (int)stack.pop();
                    result = first_operand + second_operand;
                    stack.push(result);
                    break;
                case "-":
                    first_operand = (int)stack.pop();
                    second_operand = (int)stack.pop();
                    result = second_operand - first_operand;
                    stack.push(result);
                    break;
                case "*":
                    first_operand = (int)stack.pop();
                    second_operand = (int)stack.pop();
                    result = first_operand * second_operand;
                    stack.push(result);
                    break;
                case "/":
                    first_operand = (int)stack.pop();
                    second_operand = (int)stack.pop();
                    result = second_operand / first_operand;
                    stack.push(result);
                    break;

                default:
                    stack.push(Integer.parseInt(character));
                    break;
            }
        }

        return stack.pop();

    }
}