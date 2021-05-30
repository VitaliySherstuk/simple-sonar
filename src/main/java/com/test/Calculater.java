package com.test;

public class Calculater {

    public Double add(Double a, Double b) {
        if (a == null || b == null) {
            return 0.0;
        }
        return a + b;
    }

    public Double subtract(Double a, Double b) {
        if (a == null || b == null) {
            return 0.0;
        }
        return a - b;
    }

    public Double division(Double a, Double b) {
        if (a == null || b == null) {
            return 0.0;
        }
        return a / b;
    }

    public Double multiply(Double a, Double b) {
        if (a == null || b == null) {
            return 0.0;
        }
        return a * b;
    }
}
