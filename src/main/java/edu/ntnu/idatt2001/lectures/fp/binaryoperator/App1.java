package edu.ntnu.idatt2001.lectures.fp.binaryoperator;

import java.util.function.BinaryOperator;

public class App1 {

  public static void main(String[] args) {

    //Eksempel 1:
    BinaryOperator<Integer> boSum = (n1, n2) -> n1 + n2;
    Integer result = boSum.apply(10, 100);
    System.out.println(result);

    //Eksempel 2:
    BinaryOperator<Integer> boMultiply = (n1, n2) -> n1 * n2;
    result = boMultiply.apply(10, 100);
    System.out.println(result);

    //Eksempel 3:
    BinaryOperator<String> boCon = (n1, n2) -> n1.concat(" ").concat(n2);
    String r = boCon.apply("Hans", "Ola");
    System.out.println(r);    

    //Eksempel 4:
    Item firstItem = new Item(10, "first");
    Item secondItem = new Item(20, "second");

    BinaryOperator<Item> boMax = (i1, i2) -> i1.getId() - i2.getId() >= 0 ? i1:i2;
    Item max = boMax.apply(firstItem, secondItem);
    System.out.println(max.toString());

    //Eksempel 4:
    BinaryOperator<Item> boMin = (i1, i2) -> i1.getId() - i2.getId() <= 0 ? i1:i2;
    Item min = boMin.apply(firstItem, secondItem);
    System.out.println(min.toString());

  }
}
