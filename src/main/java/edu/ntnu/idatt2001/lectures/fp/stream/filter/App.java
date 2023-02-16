package edu.ntnu.idatt2001.lectures.fp.stream.filter;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App {

  public static void main(String[] args) {

    List<Student> students = AppData.getData();
    List<Student> femaleStudents = new ArrayList<>();

    for (Student student : students) {
      if ("F".equals(student.getGender())) {
        femaleStudents.add(student);
      }
    }
    System.out.println(femaleStudents);

    System.out.println("\nMed lambda: ");
    femaleStudents = students.stream()
        .filter(p -> "F".equals(p.getGender()))
        .toList();

    femaleStudents.forEach(System.out::println);
  }
}
