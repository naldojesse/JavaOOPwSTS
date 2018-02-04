package com.naldojesse.calculatorII;
//
//The client has requested a change in spec: they need the calculator to process multiple values, as well as have some more complex abilities. They need the possibility for you to add several numbers in a row: this requires a change in our interface as we can't be sure how many total operands the client will be using. Now they expect this to work:
//        ● performOperation(10.5)
//        ● performOperation("+")
//        ● performOperation(5.2)
//        ● performOperation("*")
//        ● performOperation(10)
//        ● performOperation("=")
//        ● getResults()
//        where the result would be 62.5. They want to be able to do this for an arbitrary number of numbers, as well as add in the capability to multiply and divide. You can assume that all inputs will be valid. Notice that the calculator must correctly perform the order of operations.


public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        double res = c1.performOperation(10.5).performOperation("+").performOperation(5.2).performOperation("*").performOperation(10).performOperation("=").getResults();
        System.out.println("Answer must equal 157");
        System.out.println("Calculation: " + res);

    }

}
