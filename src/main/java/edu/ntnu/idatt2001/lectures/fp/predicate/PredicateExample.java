package edu.ntnu.idatt2001.lectures.fp.predicate;

import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args) {
    Predicate<Integer> prInt = a -> (a > 19);
    Predicate<Double> prDoub = a -> (a > 0.4);

    System.out.println(prInt.test(10));
    System.out.println(prDoub.test(0.6));
  }
}
