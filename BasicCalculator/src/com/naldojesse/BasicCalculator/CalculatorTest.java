package com.naldojesse.BasicCalculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator(43.9, 85.18, "+");
		Calculator c2 = new Calculator();
		
		//testing setting operand one
		c2.setOperandOne(10);
		System.out.println("Set new operand one");
		System.out.println(c2.getOperandOne());
		
		//testing setting operand two 
		c2.setOperandTwo(5);
		System.out.println("Set new operand two");
		System.out.println(c2.getOperandTwo());
		
		//testing setting the operation
		c2.setOperation("-");
		System.out.println("Setting operation");
		System.out.println(c2.getOperation());
		
		//testing performOperation() method
		System.out.println("Performing Operation");
		System.out.println(c2.performOperation());


		//getting results
		System.out.println("Results");
		System.out.println(c2.getResults());
	}
}
