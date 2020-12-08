package org.maox.algorithm;

import java.util.stream.IntStream;

public class Multiples3or5 {
    /**
     * Funcional
     *
     * @param number
     * @return
     */
    public static int solution1(int number) {
        number--;
        if (number <= 0) return 0;
        return ((number % 3 == 0 || number % 5 == 0) ? number : 0) + solution1(number);
    }

    /**
     * Imperativo
     *
     * @param number
     * @return
     */
    public int solution2(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Lambda
     *
     * @param number
     * @return
     */
    public int solution3(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}