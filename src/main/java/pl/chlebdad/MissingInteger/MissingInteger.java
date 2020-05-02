package pl.chlebdad.MissingInteger;

import java.util.Arrays;

/***
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 *
 * TIME: 29 min
 */

public class MissingInteger {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-6, 1, 6, 3, 2}));
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{-1, -3}));
    }

    public static int solution(int[] A) {

        Arrays.sort(A);

        boolean[] seen = new boolean[A.length];

        for (int i : A) {
            if (0 < i && i <= A.length) {
                seen[i - 1] = true;
            }
        }

        for (int i = 0; i < seen.length; i++) {
            if (!seen[i]) return i + 1;
        }

        return A.length + 1;
    }
}
