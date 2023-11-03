package com.entertainment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionChannelComparatorTest {
    Television tv1 = new Television("Sony");
    Television tv2 = new Television("Sony");
    Television tv3 = new Television("Samsung");

    @Test
    public void testCompareEqualBrands() {
        int result = tv1.compareTo(tv2);
        assertEquals("tv1 equals tv2", 0, result);
    }

    @Test
    public void testCompareNotEqualBrands() {
        int result = tv1.compareTo(tv3);
        assertNotEquals("tv1 does not equal tv3", 0, result);
    }
}