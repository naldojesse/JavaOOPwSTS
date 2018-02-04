package com.naldojesse.calculatorII;
import java.util.ArrayList;

public class Calculator implements java.io.Serializable, CalcInterface{
    private double results;
      private ArrayList<Double> numbers = new ArrayList<>();
      private ArrayList<String> operands = new ArrayList<>();

    public Calculator() {
    }

    private void calculate() {
        results = numbers.get(0);
        System.out.println(results);
        System.out.println(operands.size());
        for (int i = 0; i < operands.size(); i++) {
            if (operands.get(i).equals("+")) {
                results += numbers.get(i+1);
            } else if (operands.get(i).equals("-")) {
                results -= numbers.get(i+1);
            } else if (operands.get(i).equals("*")) {
                results *= numbers.get(i+1);
            } else if (operands.get(i).equals("/")) {
                results /= numbers.get(i+1);
            }
        }
    }

    public Calculator performOperation(String operand) {
        if (operand.equals("=")) {
            calculate();
        } else {
            operands.add(operand);
        }
        return this;
    }

    public Calculator performOperation(double number) {
        numbers.add(number);
        return this;
    }


    public double getResults() {
        return results;
    }
}
