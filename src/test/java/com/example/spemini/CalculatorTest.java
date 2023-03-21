package com.example.spemini;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class CalculatorTest 
{
    Calculator scientific_calc = new Calculator();

    // True positivies of square root 
    @Test
    void testSquareRootTP() 
    {
        assertEquals(2.0, scientific_calc.SquareRoot(4), 0.0f);
        assertEquals(3.0, scientific_calc.factorial(9), 0.0f);
        assertEquals(0.0, scientific_calc.factorial(0), 0.0f);
        assertEquals(4.0, scientific_calc.factorial(16), 0.0f);
        assertEquals(10.0, scientific_calc.factorial(100), 0.0f);
    }

    // False positives of square root
    @Test
    void testSquareRootFP() 
    {
        assertNotEquals(2, scientific_calc.SquareRoot(9), 0.0f);
        assertNotEquals(1, scientific_calc.SquareRoot(5), 0.0f);
        assertNotEquals(6, scientific_calc.SquareRoot(10), 0.0f);
        assertNotEquals(56, scientific_calc.SquareRoot(100), 0.0f);
        assertNotEquals(2, scientific_calc.SquareRoot(6), 0.0f);
    }

    // True positivies of factorial 
    @Test
    void testFactorialTP() 
    {
        assertEquals(720, scientific_calc.factorial(6), 0.0f);
        assertEquals(120, scientific_calc.factorial(5), 0.0f);
        assertEquals(1, scientific_calc.factorial(0), 0.0f);
        assertEquals(1, scientific_calc.factorial(1), 0.0f);
        assertEquals(24, scientific_calc.factorial(4), 0.0f);
    }

    // False positives of factorial
    @Test
    void testFactorialFP() 
    {
        assertNotEquals(3, scientific_calc.factorial(2), 0.0f);
        assertNotEquals(12, scientific_calc.factorial(3), 0.0f);
        assertNotEquals(1, scientific_calc.factorial(7), 0.0f);
        assertNotEquals(100, scientific_calc.factorial(10), 0.0f);
        assertNotEquals(24, scientific_calc.factorial(6), 0.0f);
    }

    // True positives of log 
    @Test
    void testLogTP() 
    {
        assertEquals(0.0, scientific_calc.naturalLogarithm(1), 0.0f);
        assertEquals(1, scientific_calc.naturalLogarithm(2.718281828459045), 0.000000000000000000001f);
    }

    // False positives of log.
    @Test
    void testLogFP() 
    {
        assertNotEquals(1, scientific_calc.naturalLogarithm(2), 0.0f);
        assertNotEquals(5, scientific_calc.naturalLogarithm(3), 0.0f);
        assertNotEquals(2, scientific_calc.naturalLogarithm(7), 0.0f);
        assertNotEquals(1, scientific_calc.naturalLogarithm(10), 0.0f);
        assertNotEquals(0, scientific_calc.naturalLogarithm(6), 0.0f);
    }

    // True positives of power
    @Test
    void testPowerTP() 
    {
        assertEquals(8, scientific_calc.power(2,3), 0.0f);
        assertEquals(1, scientific_calc.power(1, 100), 0.0f);
        assertEquals(9, scientific_calc.power(3,2), 0.0f);
        assertEquals(1000, scientific_calc.power(10, 3), 0.0f);
        assertEquals(512, scientific_calc.power(8, 3), 0.0f);
    }

    // False positives of power
    @Test
    void testPowerFP() 
    {
        assertNotEquals(0, scientific_calc.power(0,100), 0.0f);
        assertNotEquals(6, scientific_calc.power(1, 1000), 0.0f);
        assertNotEquals(2, scientific_calc.power(7, 2), 0.0f);
        assertNotEquals(1, scientific_calc.power(6, 3), 0.0f);
        assertNotEquals(0, scientific_calc.power(4, 3), 0.0f);
    }


}
