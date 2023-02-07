package edu.ntnu.idatt2001.lectures.fp.funcationalinterface.doublevalue;



public class AppNormal {

  public static void main(String[] args) {
    DoubleValueComputer adderNormal = new DoubleValueComputer() {
      @Override
      public double compute(double x, double y) {
        return x + y;
      }
    };

    DoubleValueComputer multiplierNormal = new DoubleValueComputer() {
      @Override
      public double compute(double x, double y) {
        return x * y;
      }
    };

    System.out.println(adderNormal.compute(10, 20));
    System.out.println(multiplierNormal.compute(10, 20));

  }
}
