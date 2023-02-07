package edu.ntnu.idatt2001.lectures.fp.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String args[]) {

    Consumer<Integer> out = a -> System.out.println(a);
    out.accept(10);

  }
}