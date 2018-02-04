package com.naldojesse.calculatorII;
import java.util.ArrayList;

public class Calculator implements java.io.Serializable, CalcInterface{
    private double results = 0;
//    private String currOperand = "";
    private ArrayList<Object> equation = new ArrayList<Object>();

    public Calculator performOperation(String operand) {
//        currOperand = operand;
        equation.add(operand):
        return this;
    }

    public Calculator performOperation(double number) {
//        if (currOperand.equals("+")) {
//            results += number;
//        } else if (currOperand.equals("-")) {
//            results -= number;
//        } else if (currOperand.equals("*")) {
//            results *= number;
//        } else if (currOperand.equals("/")) {
//            results = results / number;
//        }
        return this;
    }


    public double getResults() {
        return results;
    }
}
