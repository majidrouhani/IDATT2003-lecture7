package edu.ntnu.idatt2001.lectures.fp.funcationalinterface.doublevalue;




public class AppLambda {

	public static void main(String[] args) {
		DoubleValueComputer adderLambda = (x, y) -> x + y;
		DoubleValueComputer multiplierLambda = (x, y) -> x * y;

		System.out.println(adderLambda.compute(10, 20));
		System.out.println(multiplierLambda.compute(10, 20));

	}
}
