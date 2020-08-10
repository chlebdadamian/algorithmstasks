package pl.chlebdad.LeetCode;

public class BubbleSort {

    public static void main(String[] args) {
        countSwaps(new int[]{3, 8, 2, 1});
    }

    static void countSwaps(int[] a) {

        int unsortedCount = a.length - 1;
        int swapped = 0;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < unsortedCount; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped++;
                    isSorted = false;
                }
            }
            unsortedCount--;
        }

        System.out.println("Array is sorted in " + swapped + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

    private static void swap(int[] a, int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;

    }
}
