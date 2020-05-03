package pl.chlebdad.PermCheck;

public class PermCheck {

    /***
     * A non-empty array A consisting of N integers is given.
     *
     * A permutation is a sequence containing each element from 1 to N once, and only once.
     *
     * For example, array A such that:
     *
     *     A[0] = 4
     *     A[1] = 1
     *     A[2] = 3
     *     A[3] = 2
     * is a permutation, but array A such that:
     *
     *     A[0] = 4
     *     A[1] = 1
     *     A[2] = 3
     * is not a permutation, because value 2 is missing.
     *
     * The goal is to check whether array A is a permutation.
     *
     * Write a function:
     *
     * class Solution { public int solution(int[] A); }
     * that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
     *
     */

    public static void main(String[] args) {

        System.out.println(solution(new int[]{4, 1, 3}));
        System.out.println(solution(new int[]{4, 1, 3, 2}));
        System.out.println(solution(new int[]{4, 1, 2, 2}));

    }

    public static int solution(int[] A) {

        long sum = 0;
        int elementsToCount = A.length;
        for (int a : A) {
            sum += a;
            sum -= elementsToCount--;
        }

        if (sum == 0) return 1;

        return 0;
    }
}
