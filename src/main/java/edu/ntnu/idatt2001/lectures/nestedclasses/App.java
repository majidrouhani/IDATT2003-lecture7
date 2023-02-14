package edu.ntnu.idatt2001.lectures.nestedclasses;

public class App {
  static int data = 30;

  // static inner class
  static class StaticInner {
    static void msg() {
      System.out.println("Message from static inner class: data > " + data);
    }

    void noneStaticMsg() {
      System.out.println("Message from static inner class (none static method): data > " + data);
    }
  }

  // member inner class
  class NoneStaticInner {
    void msg() {
      System.out.println("Message from member inner class: data > " + data);
    }
  }

  // anonymous inner class (helper class)
  class Student implements Age {
    @Override
    public void getAge() {
      System.out.println("Message from anonymous inner class: age > " + age);
    }
  }

  // local inner class
  void display() {
    class Local {
      void msg() {
        System.out.println("Message from local inner class: data > "+data);
      }
    }
    Local l = new Local();
    l.msg();
  }

  public static void main(String args[]) {

    System.out.println(App.data);
    
    App.StaticInner.msg();

    new App.StaticInner().noneStaticMsg();

    App.NoneStaticInner noneNtaticObj = new App().new NoneStaticInner();
    noneNtaticObj.msg();

    App.Student student = new App().new Student();
    student.getAge();

    new App().display();

  }
}