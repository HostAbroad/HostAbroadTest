package com.HostAbroadTests;

public class Calculator {
	
	public Calculator(int operator1, int operator2) {
		super();
		this.operator1 = operator1;
		this.operator2 = operator2;
	}
	
	private int operator1;
	private int operator2;
	
	public int suma() {
		return operator1 + operator2;
	}
	
	public int resta() {
		return operator1 - operator2;
	}
	
	public int multiplica() {
		return operator1 * operator2;
	}
	
	public int divide() {
		return operator1 / operator2;
	}

	public int getOperator1() {
		return operator1;
	}

	public void setOperator1(int operator1) {
		this.operator1 = operator1;
	}

	public int getOperator2() {
		return operator2;
	}

	public void setOperator2(int operator2) {
		this.operator2 = operator2;
	}

}



