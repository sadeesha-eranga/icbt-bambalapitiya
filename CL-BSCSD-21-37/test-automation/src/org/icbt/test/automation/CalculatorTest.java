package org.icbt.test.automation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        System.out.println("add");
        int no1 = 5;
        int no2 = 2;
        int expResult = 7;
        int result = Calculator.add(no1, no2);
        assertEquals(expResult, result);
    }

    @Test
    void substract() {
        System.out.println("substract");
        int no1 = 5;
        int no2 = 2;
        int expResult = 3;
        int result = Calculator.substract(no1, no2);
        assertEquals(expResult, result);
    }

    @Test
    void devide() {
        System.out.println("devide");
        int no1 = 6;
        int no2 = 2;
        int expResult = 3;
        int result = Calculator.devide(no1, no2);
        assertEquals(expResult, result);
    }

    @Test
    void multiply() {
        System.out.println("multiply");
        int no1 = 5;
        int no2 = 2;
        int expResult = 10;
        int result = Calculator.multiply(no1, no2);
        assertEquals(expResult, result);
    }
}