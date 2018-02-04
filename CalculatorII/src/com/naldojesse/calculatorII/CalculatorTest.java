package com.naldojesse.calculatorII;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        double res = c1.performOperation(10.5).performOperation("+").performOperation(5.2).performOperation("*").performOperation(10).performOperation("=").getResults();
//        System.out.println("hello");
        System.out.println(res);

    }

}
