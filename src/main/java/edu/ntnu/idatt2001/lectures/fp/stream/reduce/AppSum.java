package edu.ntnu.idatt2001.lectures.fp.stream.reduce;



import java.text.ParseException;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class AppSum {

  public static void main(String[] args) throws ParseException {

		List<Student> students = AppData.getData();

    int sumAge = 0;
    for (Student student : students) {
      sumAge += student.getAge();
    }
    System.out.println(sumAge);

    System.out.println("\nLambda: ");
    sumAge = students.stream().map(s -> s.getAge()).reduce((a1, a2) -> a1 + a2).get();
    System.out.println(sumAge);
  }
}
