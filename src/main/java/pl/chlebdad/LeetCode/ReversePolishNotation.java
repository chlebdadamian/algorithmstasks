package pl.chlebdad.LeetCode;

import java.util.Stack;

public class ReversePolishNotation {

    public static void main(String[] args) {

        String[] tokens = new String[]{"2", "1", "+", "3", "*"};
        System.out.println(reversePN(tokens));

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
}
