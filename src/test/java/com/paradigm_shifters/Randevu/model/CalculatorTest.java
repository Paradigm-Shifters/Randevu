package com.paradigm_shifters.Randevu.model;

import org.junit.*;

public class CalculatorTest {

    private Calculator c;

    @Before     // Setup logic
    public void setUp() {
        System.out.println("before testing...");
        c = new Calculator();
    }

    @After      // Cleanup logic
    public void cleanup() {
        System.out.println("Finishing and cleaning up the test...");
    }

    @Test
    public void testAdd() {
        int res = c.add(10, 20);
        Assert.assertEquals(30, res);
    }

    @Test
    public void testAdd2() {
        int res = c.add(100, 20);
        Assert.assertEquals(120, res);
    }

    @Test
    public void testAdd3() {
        int res = c.add(-100, -20);
        Assert.assertEquals(-120, res);
    }
}
