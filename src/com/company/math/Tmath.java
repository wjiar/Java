package com.company.math;

public class Tmath {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw  new IllegalArgumentException("分母不能为零");
        }

        return a/b;
    }
}
