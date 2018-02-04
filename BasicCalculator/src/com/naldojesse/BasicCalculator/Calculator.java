package com.naldojesse.BasicCalculator;

public class Calculator implements java.io.Serializable, CalcInterface{
	private double operandOne;
	private double operandTwo; 
	private String operation;
	private double results;
	
	
	public Calculator() {
		operandOne = 0;
		operandTwo = 0;
		operation = "+";
		results = 0;
	}
	
	public Calculator(double operandOne, double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	
	public String performOperation() {
		if (operation == "+") {
			results = operandOne + operandTwo;
			return "Performed addition!";
		} else if (operation == "-"){
			results = operandOne - operandTwo;
			return "Performed subtraction!";
		} else {
			return "Unrecognizable Operand, please set operand and try again!";
		}
	}
	
	public double getResults() {
		return results;
	}
	
}
