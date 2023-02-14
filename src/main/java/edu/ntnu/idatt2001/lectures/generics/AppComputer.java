package edu.ntnu.idatt2001.lectures.generics;

public class AppComputer {

	public static void main(String args[]) {

		Computer<Integer, Integer> adderInt = (x, y) -> x + y;
		Computer<Double, Double> adderDouble = (x, y) -> x + y;

		Computer<String, String> adderStr1 = (x,y) -> x+y;
		Computer<String, String> adderStr2 = String::concat;

		System.out.println(adderStr1.compute("Lambda ", "Demo"));
		System.out.println(adderStr2.compute("Lambda ", "Demo"));
		System.out.println(adderInt.compute(100, 50));
		System.out.println(adderDouble.compute(100.5, 50.1));
	}
}
