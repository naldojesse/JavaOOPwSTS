package com.naldojesse.BasicCalculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator(43.9, 85.18, "+");
		Calculator c2 = new Calculator();
		
		//testing setting operand one
		c2.setOperandOne(95.21);
		System.out.println(c2.getOperandOne());
		
		//testing setting operand two 
		c2.setOperandTwo(954.11);
		System.out.println(c2.getOperandTwo());
		
		//testing setting perform operation
		c2.setOperation("-");
		System.out.println(c2.getOperation());
		
		//testing getresults() method
		
	}
}
