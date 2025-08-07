package test;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValidParentheses(String s){

        Stack<Character> stack = new Stack<>();

        for( char ch : s.toCharArray()){

            if( ch == '(')
                stack.push(')');
            else if( ch == '{')
                    stack.push('}');
            else if ( ch == '[')
                stack.push(']');

                else if (stack.isEmpty() || stack.pop() != ch )
                   return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}"; // You can change this to test other cases

        boolean isValid = isValidParentheses(input);

        System.out.println("Input: " + input);
        System.out.println("Is valid: " + isValid);
    }
}
