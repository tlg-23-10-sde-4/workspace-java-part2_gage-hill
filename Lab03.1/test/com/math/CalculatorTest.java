/*
 * create a test class, write a test method annotated with @Test
 * -- set up a business object and invoke a business method on it
 * -- make assertions about the results via static methods
 * -- Junit base package is 'org.junit'
 *
 * Does a 'business method' do what it's supposed to do?
 *
 */
package com.math;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*; // 'static' template is usually called

public class CalculatorTest {
    // declare the fixture: business object(s) under test
    private Calculator calc; // 'calc' = Calculator class reference

    @BeforeClass // runs once - must be static - runs before any tests
    public static void initializeTestRun() {
        System.out.println("initializeTestRun");
    }

    @AfterClass // runs once - must be static - runs after all tests
    public static void tearDownTestRun() {
        System.out.println("tearDownTestRun");
    }

    @Before // open up a connection to a database
    public void setUp() {
        System.out.println("setUp");

        calc = new Calculator(); // create a calculator class to test - instance of Calculator object - every test gets a fresh new 'calc'
    }

    // tearDown "clean up" any methods in the @Before method
    // closes any open connections in the @Before method
    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    // 'test case' - must be annotated as @Test to be run as a test case
    @Test
    public void testIsEven() {
        System.out.println("testIsEven");

        assertTrue(calc.isEven(10)); // passes if the boolean condition evaluates to true
        assertFalse(calc.isEven(11)); // passes if the boolean condition evaluates to false
    }

    @Test
    public void testDivide() {
        System.out.println("testDivide");

        assertEquals(2.55, calc.divide(5, 2), .0001); // expected, actual, delta --> delta is used when comparing 'doubles'
    }

    @Test
    public void testAdd() {
        System.out.println("testAdd");

        assertEquals(5, calc.add(1, 4));  // expected, actual
    }
}

// don't print test
// must be a public class, otherwise the Calculator class won't see it
// checked = passed
// 'x' = failed
// there is no order to 'tests' at run