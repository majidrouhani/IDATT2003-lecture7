package edu.ntnu.idatt2001.lectures.nestedclasses.example;

public class OuterClass {
  private final String name = "Ola Norman";

  class InnerClass {
    private final String name = "Hans Hansen";

    public String getName() {
      return name;
    }
  }

  InnerClass innerClass = new InnerClass();

  public String getName() {
    return name;
  }

  public static void main(String args[]) {
    OuterClass outerClass = new OuterClass();
    System.out.println("Outer class:"+outerClass.getName());

    System.out.println("Outer class, inner class: "+outerClass.innerClass.getName());
    
    OuterClass.InnerClass innerClass = outerClass.new InnerClass();
    System.out.println("Inner class: "+innerClass.getName());
    
  }
}