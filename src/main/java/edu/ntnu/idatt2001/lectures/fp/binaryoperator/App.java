package edu.ntnu.idatt2001.lectures.fp.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class App {

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

    Item firstItem = new Item(10, "first");
    Item secondItem = new Item(20, "second");

    BinaryOperator<Item> boMax = BinaryOperator.maxBy(compItem);
    Item max = boMax.apply(firstItem, secondItem);    
    System.out.println(max);    

    //Eksempel 2: lambda
    Comparator<Item> compItem2 = (o1, o2) -> o1.getId() - o2.getId();
    BinaryOperator<Item> boMax2 = BinaryOperator.maxBy(compItem2);
    Item max2 = boMax2.apply(firstItem, secondItem);    
    System.out.println(max2);    
    
    //Eksempel 3:
    BinaryOperator<Item> binaryOperator = BinaryOperator.minBy(compItem);
    Item min = binaryOperator.apply(firstItem, secondItem);    
    System.out.println(min);    

    //Eksempel 4:
    BinaryOperator<Item> binaryOperator2 = BinaryOperator.minBy((o1, o2) -> o1.getId() - o2.getId());
    min = binaryOperator2.apply(firstItem, secondItem);    
    System.out.println(min);    

  }
}
