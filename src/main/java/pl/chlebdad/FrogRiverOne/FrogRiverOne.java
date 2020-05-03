package pl.chlebdad.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    /*** Find the earliest time when a frog can jump to the other side of a river.
     *
     */

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));  // 6
    }

    public static int solution(int X, int[] A) {

        Set<Integer> num = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) num.add(A[i]);
            if (num.size() == X) return i;
        }
        return -1;
    }
}
