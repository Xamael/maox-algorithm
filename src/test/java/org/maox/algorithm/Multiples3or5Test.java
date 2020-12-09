package org.maox.algorithm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Multiples3or5Test {
    @Test
    public void test1() {
        long startTime = System.nanoTime();
        assertEquals(23, new Multiples3or5().solution1(10));
        assertEquals(78, new Multiples3or5().solution1(20));
        assertEquals(9168, new Multiples3or5().solution1(200));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //Total execution time in milli seconds
        System.out.println("Solution 1 (Funcional): "+duration+" nanosec");
    }

    @Test
    public void test2() {
        long startTime = System.nanoTime();
        assertEquals(23, new Multiples3or5().solution2(10));
        assertEquals(78, new Multiples3or5().solution2(20));
        assertEquals(9168, new Multiples3or5().solution2(200));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //Total execution time in milli seconds
        System.out.println("Solution 2 (Imperativo): "+duration+" nanosec");
    }

    @Test
    public void test3() {
        long startTime = System.nanoTime();
        assertEquals(23, new Multiples3or5().solution3(10));
        assertEquals(78, new Multiples3or5().solution3(20));
        assertEquals(9168, new Multiples3or5().solution3(200));
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //Total execution time in milli seconds
        System.out.println("Solution 3 (Lambdas):"+duration+" nanosec");
    }
}