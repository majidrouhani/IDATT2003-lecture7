package edu.ntnu.idatt2001.lectures.fp.funcationalinterface.defaultmethod;

public class DoubleValueComputerNormal {

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

      @Override
      public double compute(double x, double y, double z) {
        return x * y * z;
      }      
    };

    
    System.out.println(adderNormal.compute(10, 20));
    System.out.println(adderNormal.compute(10.0, 20, 30));
    System.out.println(multiplierNormal.compute(10, 20));
    System.out.println(multiplierNormal.compute(10, 20, 30));
  }
}
