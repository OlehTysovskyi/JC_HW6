package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
	
	private double a;
	private double b;
	
	MyCalculator(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void plus() {
		double sum = a + b;
		System.out.printf("a+b = " + "%.1f",sum);
		System.out.println();

	}
	@Override
	public void minus() {
		double dif = a - b;
		System.out.printf("a-b = " + "%.1f",dif);
		System.out.println();

	}
	@Override
	public void multiply() {
		double prd = a * b;
		System.out.printf("a*b = " + "%.1f",prd);
		System.out.println();

	}
	@Override
	public void devide() {
		double frc = a / b;
		System.out.printf("a/b = " + "%.1f",frc);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		MyCalculator myCalc = new MyCalculator(51.2, 2.4);
		myCalc.plus();
		myCalc.minus();
		myCalc.multiply();
		myCalc.devide();

	}

}
