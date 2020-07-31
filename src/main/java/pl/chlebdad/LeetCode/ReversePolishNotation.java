package pl.chlebdad.LeetCode;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {

        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(ReversePolishNotation("1 2 + 3 *"));

    }


    public static int reversePN(String[] tokens) {

        Stack<Integer> result = new Stack<>();
        String signs = new String("+-/*");

        for (String t : tokens) {

            if (!signs.contains(t)) {
                result.push(Integer.parseInt(t));
            } else {
                int a = result.pop();
                int b = result.pop();
                int index = signs.indexOf(t);
                switch (index) {
                    case 0:
                        result.push(a + b);
                        break;
                    case 1:
                        result.push(a - b);
                        break;
                    case 2:
                        if (b != 0) {
                            result.push(a / b);
                        } else {
                            System.out.println("Error: Divide by O!");
                        }
                        break;
                    case 3:
                        result.push(a * b);
                        break;
                }
            }

        }


        return result.pop();
    }

    public static String ReversePolishNotation(String str) {

        String strTrimmed = str.replaceAll("[ \\t\\n\\x0B\\f\\r]", "");
        //String expr;
        char[] arr = strTrimmed.toCharArray();

        String signs = new String("+-*/");

        Stack<Integer> result = new Stack<>();

        for (char s : arr) {

            if (!signs.contains(Character.toString(s))) {
                result.push(Character.getNumericValue(s));
            } else {

                int a = result.pop();
                int b = result.pop();

                switch (signs.indexOf(Character.toString(s))) {

                    case 0:
                        result.push(a + b);
                        break;
                    case 1:
                        result.push(a - b);
                        break;
                    case 2:
                        result.push(a * b);
                        break;
                    case 3:
                        if (b != 0) {
                            result.push(a / b);
                        } else {
                            return "0";
                        }
                        break;

                }

            }

        }
        // code goes here
        return String.valueOf(result.pop());
    }
}
