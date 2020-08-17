package pl.chlebdad.Misc;

import java.util.Arrays;
import java.util.List;

public class LongestSubarray {

    static void longest(int a[], int n, int k) {
        int[] freq = new int[7];

        int start = 0, end = 0, now = 0, l = 0;
        for (int i = 0; i < n; i++) {

            // mark the element visited
            freq[a[i]]++;

            // if its visited first time, then increase
            // the counter of distinct elements by 1
            if (freq[a[i]] == 1)
                now++;

            // When the counter of distinct elements
            // increases from k, then reduce it to k
            while (now > k) {

                // from the left, reduce the number of
                // time of visit
                freq[a[l]]--;

                // if the reduced visited time element
                // is not present in further segment
                // then decrease the count of distinct
                // elements
                if (freq[a[l]] == 0)
                    now--;

                // increase the subsegment mark
                l++;
            }

            // check length of longest sub-segment
            // when greater then previous best
            // then change it
            if (i - l + 1 >= end - start + 1) {
                end = i;
                start = l;
            }
        }

        // print the longest sub-segment
        for (int i = start; i <= end; i++)
            System.out.print(a[i] + " ");
    }

    // Driver code
    public static void main(String args[]) {
        Integer a[] = {6, 5, 1, 2, 3, 2, 1, 4, 5};
        int n = a.length;
        int k = 1;
        //  longest(a, n, k);
        longestSubarray(Arrays.asList(a));
    }

    public static int longestSubarray(List<Integer> arr) {

        if (arr.size() == 1) return 1;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int counter = 0;
            int increment = i + 1;
            int mini = arr.get(i);
            int maxi = arr.get(i);

            while (increment < arr.size()) {

                if (Math.abs(arr.get(i) - arr.get(increment)) > 1) break;
                if (mini > arr.get(increment)) mini = arr.get(increment);
                if (maxi < arr.get(increment)) maxi = arr.get(increment);
                increment++;
                if (Math.abs(mini - maxi) > 1) break;
                counter++;
            }

            if (counter > max) max = counter;

        }
        // Write your code here
        return max + 1;
    }
}
