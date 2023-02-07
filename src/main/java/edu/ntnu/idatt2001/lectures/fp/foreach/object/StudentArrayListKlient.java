package edu.ntnu.idatt2001.lectures.fp.foreach.object;

import java.util.ArrayList;

public class StudentArrayListKlient {

  public static void main(String[] args) {

    ArrayList<Student> studenter = new ArrayList<Student>();

    Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
    Student student2 = new Student("Ingrid", "Olsen", 197512101, "Kvinne");
    Student student3 = new Student("�se Marie", "Jensen", 19730506, "Kvinne");

    studenter.add(student1);
    studenter.add(student2);
    studenter.add(student3);
    studenter.add(student1);

    System.out.println("\nUtskrift UTEN bruk av lambda:");
    for (Student s : studenter) {
      System.out.println(s);
    }

    System.out.println("\nUtskrift MED bruk av lambda alt 1:");
    studenter.forEach(p -> System.out.println(p));

    System.out.println("\nUtskrift MED bruk av lambda alt 2:");
    studenter.forEach(p -> System.out.println(p));
  }
}
