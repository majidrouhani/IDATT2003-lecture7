package edu.ntnu.idatt2001.lectures.fp.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryopertorExample {

  public static void main(String[] args) {

    //Eksempel 1:
    BinaryOperator<Integer> bo = (n1, n2) -> n1 + n2;
    Integer sum = bo.apply(10, 100);
    System.out.println(sum);

    
    //Eksempel 2:
    Comparator<Item> compItem = new Comparator<Item>() {
      @Override
      public int compare(Item o1, Item o2) {
        return o1.getId() - o2.getId();
      }
    };
    
    BinaryOperator<Item> boMax = BinaryOperator.maxBy(compItem);

    Item max = boMax.apply(new Item(10, "first"), new Item(20, "second"));    
    System.out.println(max);    
   
    
    //Eksempel 3:
    BinaryOperator<Item> binaryOperator = BinaryOperator.minBy(compItem);

    Item min = binaryOperator.apply(new Item(10, "first"), new Item(20, "second"));    
    System.out.println(min);    
  }
}
