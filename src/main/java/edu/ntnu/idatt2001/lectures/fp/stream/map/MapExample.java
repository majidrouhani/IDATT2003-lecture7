package edu.ntnu.idatt2001.lectures.fp.stream.map;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;


public class MapExample {

  public static void main(String[] args) {

		List<Student> students = AppData.getData();


    List<LocalDate> birthdays = new ArrayList<>();
    for (Student student : students) {
      birthdays.add(student.getBirthday());
    }
    System.out.println(birthdays);

    System.out.println("\nLambda: ");
    birthdays = students.stream().map(s-> s.getBirthday()).toList();
    birthdays.forEach(System.out::println);
  }
}
