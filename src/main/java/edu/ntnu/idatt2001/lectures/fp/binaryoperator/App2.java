package edu.ntnu.idatt2001.lectures.fp.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class App2 {

  public static void main(String[] args) {


    Item firstItem = new Item(10, "first");
    Item secondItem = new Item(20, "second");

    Comparator<Item> compItem = (Item o1, Item o2) -> o1.getId() - o2.getId();    
    System.out.println(compItem.compare(firstItem, secondItem));
    
    //Eksempel 1: lambda
    BinaryOperator<Item> boMax = BinaryOperator.maxBy(compItem);
    Item max = boMax.apply(firstItem, secondItem);    
    System.out.println(max);    
    
    //Eksempel 2:
    BinaryOperator<Item> binaryOperator = BinaryOperator.minBy(compItem);
    Item boMin = binaryOperator.apply(firstItem, secondItem);    
    System.out.println(boMin);    
  }
}
