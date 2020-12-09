package org.maox.algorithm;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        boolean even = false;
        int outlier = 0;

        if (integers[0] % 2 == 0 && integers[1] % 2 == 0 || integers[0] % 2 == 0 && integers[2] % 2 == 0 || integers[1] % 2 == 0 && integers[2] % 2 == 0)
            even = true;

        for (int idx = 0; idx < integers.length; idx++) {
            if (integers[idx] % 2 == 0 && !even || integers[idx] % 2 != 0 && even) {
                outlier = integers[idx];
                break;
            }
        }

        return outlier;
    }

    public static int find2(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}


