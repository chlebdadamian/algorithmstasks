package pl.chlebdad.PermMissingElem;

import java.util.Arrays;

public class PermMissingElem {

    /***
     * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
     *
     * Your goal is to find that missing element.
     *
     * Write a function:
     *
     * class Solution { public int solution(int[] A); }
     * that, given an array A, returns the value of the missing element.
     *
     * For example, given array A such that:
     *
     *   A[0] = 2
     *   A[1] = 3
     *   A[2] = 1
     *   A[3] = 5
     * the function should return 4, as it is the missing element.
     */

    public static void main(String[] args) {

        System.out.println(solution(new int[]{2, 3, 1, 5}));   //4
        System.out.println(solution(new int[]{2, 3, 7, 4, 1, 5})); //6
        System.out.println(solution(new int[]{2, 3, 4, 5})); //1
        System.out.println(solution(new int[]{2, 3, 1, 4})); //5

    }

    public static int solution(int[] A) {

        if (A.length == 0) return 0;

        Arrays.sort(A);

        int result = 1;
        for (int i = 1; i < A.length; i++) {

            if (A[i] - A[i - 1] != 1) {
                result = A[i] - 1;
            } else if (A[0] == 1) {
                result = A[A.length - 1] + 1;
            }
        }
        return result;
    }

}
