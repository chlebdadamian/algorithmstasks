package pl.chlebdad.LeetCode;

import java.util.Arrays;

public class RotateArray {


//    Rotate an array of n elements to the right by k steps.
//
//    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//    How many different ways do you know to solve this problem?

    public static void main(String[] args) {

        System.out.println(Arrays.toString(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3)));

    }

    public static int[] rotateArray(int[] array, int order) {

        int[] result = new int[array.length];

        for (int i = order + 1, j = 0; i < array.length; i++, j++) {

            result[j] = array[i];

            if (i == array.length - 1) {

                for (int k = 0, l = j + 1; k <= order; k++, l++) {
                    result[l] = array[k];
                }


            }

        }


        return result;

    }

}
