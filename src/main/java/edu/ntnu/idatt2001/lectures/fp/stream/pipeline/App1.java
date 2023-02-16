package edu.ntnu.idatt2001.lectures.fp.stream.pipeline;

import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App1 {

  public static void main(String[] args) {
    List<Student> students = AppData.getData();

    students.stream()
        .filter(p -> "F".equals(p.getGender()))
        .map(Student::getBirthday)
        .sorted()
        .forEach(System.out::println);
  }
}
