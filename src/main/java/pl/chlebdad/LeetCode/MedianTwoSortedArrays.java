package pl.chlebdad.LeetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MedianTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(findMedianSortedArrays(new int[]{1, 8, 3}, new int[]{2, 4}));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // add to arraylist
        List<Integer> list = new ArrayList<>();
        int a = nums1.length;
        int b = nums2.length;
        int ab = a + b;

        for (int i = 0; i < ab; i++) {

            if (i < a) {
                list.add(nums1[i]);
            } else {
                list.add(nums2[i - a]);
            }
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list.toString());
        double result;
        int size = list.size();

        if (list.size() % 2 != 0) {

            result = list.get((size - 1) / 2);

        } else {

            result = (list.get(size / 2 - 1) + list.get(size / 2)) / (double) 2;

        }

        return result;
    }

}
