package edu.ntnu.idatt2001.lectures.fp.foreach.string;

import java.util.ArrayList;

public class Example01 {

  public static void main(String[] args) {

    ArrayList<String> names = new ArrayList<String>();

    names.add("Hans");
    names.add("Ola");

    System.out.println("\nUten lambda, alternativ 1");
    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

    System.out.println("\nUten lambda, alternativ 2");
    for (String name : names) {
      System.out.println(name);
    }

    System.out.println("\nBruk av lambda");
    names.forEach(s -> System.out.println(s));

  }
}
