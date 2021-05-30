package com.test;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculaterTest {

    private Calculater calc = new Calculater();

    @Test
    public void add() {
        Double a = 12.0;
        Double b = 12.0;

        Double result = calc.add(a, b);

        assertEquals(result, Double.valueOf(24.0));
    }

    @Test
    public void subtract() {
        Double a = 12.0;
        Double b = 12.0;

        Double result = calc.subtract(a, b);

        assertEquals(result, Double.valueOf(0.0));
    }

    @Test
    public void division() {
        Double a = 12.0;
        Double b = 12.0;

        Double result = calc.division(a, b);

        assertEquals(result, Double.valueOf(1.0));
    }

    @Test
    public void multiply() {
        Double a = 12.0;
        Double b = 12.0;

        Double result = calc.multiply(a, b);

        assertEquals(result, Double.valueOf(144.0));
    }
}