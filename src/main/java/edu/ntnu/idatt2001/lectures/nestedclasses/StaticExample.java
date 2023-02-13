package edu.ntnu.idatt2001.lectures.nestedclasses;

public class StaticExample {
  static int data = 30;

  static class StaticInner {
    void msg() {
      System.out.println("data is " + data);
    }
  }

  class NoneStaticInner {
    void msg() {
      System.out.println("data is " + data);
    }
  }
  
  public static void main(String args[]) {
    StaticExample.StaticInner staticInnerObj = new StaticExample.StaticInner();
    staticInnerObj.msg();
    
    StaticExample staticObj = new StaticExample();
    StaticExample.NoneStaticInner noneNtaticObj = staticObj.new NoneStaticInner();
    noneNtaticObj.msg(); 
  }
}