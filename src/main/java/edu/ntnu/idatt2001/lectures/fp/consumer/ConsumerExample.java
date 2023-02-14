package edu.ntnu.idatt2001.lectures.fp.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String args[]) {

    Consumer<Integer> out1 = a -> System.out.println(a);

    Consumer<Integer> out2 = System.out::println;

    out1.accept(10);
    out2.accept(10);
  }
}