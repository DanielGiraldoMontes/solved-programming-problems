package com.solved.SolvedProblems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author dgiraldo
 */

public class DivisibleSevenTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new long[] {7, 2}, DivisibleSeven.seven(1603));
        assertArrayEquals(new long[] {35, 1}, DivisibleSeven.seven(371));
        assertArrayEquals(new long[] {42, 1}, DivisibleSeven.seven(483));
    }
}
