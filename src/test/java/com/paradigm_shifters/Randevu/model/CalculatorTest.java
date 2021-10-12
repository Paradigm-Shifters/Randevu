package com.paradigm_shifters.Randevu.model;

import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;
    private int result;

    @Before     // Setup logic
    public void setUp() {
        System.out.println("before testing...");
        calculator = new Calculator();
    }

    @After      // Cleanup logic
    public void cleanup() {
        System.out.println("Finishing and cleaning up the test...");
    }

    @Test
    public void testSquare() {
        result = calculator.square(5);
        Assert.assertEquals(25, result);
    }

    @Test
    public void testSquare2() {
        result = calculator.square(10);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testCountA() {
        result = calculator.countA("alphabet");
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCountA2() {
        result= calculator.countA("javabean");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testAdd() {
        result = calculator.add(10, 20);
        Assert.assertEquals(30, result);
    }

    @Test
    public void testAdd2() {
        result = calculator.add(100, 20);
        Assert.assertEquals(120, result);
    }

    @Test
    public void testSubtract() {
        result = calculator.subtract(10, 20);
        Assert.assertEquals(-10, result);
    }

    @Test
    public void testSubtract2() {
        result = calculator.subtract(100, 20);
        Assert.assertEquals(80, result);
    }

    @Test
    public void testDivide() {
        result = calculator.divide(10, 2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testDivide2() {
        result = calculator.divide(100, 20);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        result = calculator.multiply(10, 20);
        Assert.assertEquals(200, result);
    }

    @Test
    public void testMultiply2() {
        result = calculator.multiply(100, 20);
        Assert.assertEquals(2000, result);
    }
}
