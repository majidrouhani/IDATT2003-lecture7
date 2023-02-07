package edu.ntnu.idatt2001.lectures.fp.stream.reduce;

import java.text.ParseException;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class AppMax1 {

  public static void main(String[] args) throws ParseException {

		List<Student> students = AppData.getData();

    int maxAge = 0;
    for (Student student : students) {
      int age = student.getAge();
      if (age > maxAge) {
        maxAge = age;
      }
    }
    System.out.println("Max age: "+maxAge);

    System.out.println("\nLambda: ");
    maxAge = students.stream().map(s -> s.getAge()).reduce(Math::max).get();    
    System.out.println("Max age: "+maxAge);

    int minAge = students.stream().map(s -> s.getAge()).reduce(Math::min).get();    
    System.out.println("Min age: "+minAge);
  }
}
