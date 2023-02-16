package edu.ntnu.idatt2001.lectures.fp.funcationalinterface.defaultmethod;

public class DoubleValueComputerLambda {

  public static void main(String[] args) {
    DoubleValueComputer adderNormal = (double x, double y) -> x + y;
    DoubleValueComputer multiplierNormal = (double x, double y) -> x * y;
    
    System.out.println(adderNormal.compute(10, 20));
    System.out.println(adderNormal.compute(10.0, 20, 30));
    System.out.println(multiplierNormal.compute(10, 20));
    System.out.println(multiplierNormal.compute(10, 20, 30));
  }
}
