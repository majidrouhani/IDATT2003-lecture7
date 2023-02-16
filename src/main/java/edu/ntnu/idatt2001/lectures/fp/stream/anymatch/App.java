package edu.ntnu.idatt2001.lectures.fp.stream.anymatch;



import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App {

  public static void main(String[] args) {

		List<Student> students = AppData.getData();

    
    boolean womanExists = false;
    for (Student student : students) {
      if ("F".equals(student.getGender())) {
        womanExists = true;
        break;
      }
    }
    System.out.println(womanExists);

    System.out.println("\nMed lambda: ");
    System.out.println(students.stream().anyMatch(p -> "F".equals(p.getGender())));
  }
}
