package edu.ntnu.idatt2001.lectures.fp.stream.anymatch;



import java.util.ArrayList;

import fp.foreach.object.Student;

public class StudentArrayListKlient {

  public static void main(String[] args) {

    ArrayList<Student> studenter = new ArrayList<Student>();

    Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
    Student student2 = new Student("Ingrid", "Olsen", 19751210, "Kvinne");
    Student student3 = new Student("�se Marie", "Jensen", 19730506, "Kvinne");

    studenter.add(student1);
    studenter.add(student2);
    studenter.add(student3);

    System.out.println("\nTradisjonell m�te: ");
    boolean womanExists = false;
    for (Student student : studenter) {
      if (student.getKjoenn() == "Kvinne") {
        womanExists = true;
        break;
      }
    }
    System.out.println(womanExists);

    System.out.println("\nMed lambda: ");
    System.out.println(studenter.stream().anyMatch(p -> p.getKjoenn() == "Kvinne"));

  }
}
