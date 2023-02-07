package edu.ntnu.idatt2001.lectures.fp.funcationalinterface.defaultmethod;

public interface DoubleValueComputer {
  public double compute(double x, double y);
  
  public default double compute(double x, double y, double z) {    
    return 0;    
  }
}
