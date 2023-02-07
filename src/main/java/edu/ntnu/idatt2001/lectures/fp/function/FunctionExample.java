package edu.ntnu.idatt2001.lectures.fp.function;

import java.util.function.Function;


public class FunctionExample {

  public static void main(String[] args) {
    
    Function<Double, Double> kvadrat = a -> a * a;
    System.out.println(kvadrat.apply(2.0));
       
  }
}
