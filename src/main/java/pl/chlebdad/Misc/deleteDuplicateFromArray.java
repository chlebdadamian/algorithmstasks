package pl.chlebdad.Misc;

import java.util.HashSet;
import java.util.Set;

public class deleteDuplicateFromArray {

    public static void main(String[] args) {

        System.out.println(deleteDuplicates(new int[]{1, 2, 3, 3, 3, 4, 5, 6, 4, 4}));

    }

    public static Set<Integer> deleteDuplicates(int[] array) {

        Set<Integer> arr = new HashSet<>();

        for (int i : array) {
            arr.add(i);
        }

        return arr;
    }
}
