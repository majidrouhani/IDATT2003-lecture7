package edu.ntnu.idatt2001.lectures.fp.consumer;

import java.util.function.IntConsumer;

public class ConsumerExample {
  public static void main(String args[]) {

    IntConsumer outIntConsumer = System.out::println;
    outIntConsumer.accept(10);

  }
}