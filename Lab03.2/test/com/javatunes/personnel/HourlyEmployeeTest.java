package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    private HourlyEmployee hemp1;

    @Before
    public void setUp() {
        hemp1 = new HourlyEmployee("Lincoln", Date.valueOf("2022-08-09"), 25.0, 30.0);
    }

    @Test
    public void testPay() {
        assertEquals(750, hemp1.pay(), .001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(187.5, hemp1.payTaxes(), .001);
    }
}