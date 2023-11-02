package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee main1;
    private Employee main2;

    @Before
    public void setUp() {
        main1 = new SalariedEmployee("Mary Lou", Date.valueOf("1999-09-09"));
        main2 = new SalariedEmployee("Mary Lou", Date.valueOf("1999-09-09"));
    }

    @Test
    public void equals_shouldReturnFalse_differentName_sameHireDate() {
        main2.setName("Mike");
        assertNotEquals(main1, main2);
    }

    @Test
    public void equals_shouldReturnFalse_sameName_differentHireDate() {
        main2.setHireDate(Date.valueOf("2000-02-02"));
        assertNotEquals(main1, main2);
    }

    @Test
    public void equals_shouldReturnTrue_allPropertiesSame() {
        assertEquals(main1, main2);
    }
}