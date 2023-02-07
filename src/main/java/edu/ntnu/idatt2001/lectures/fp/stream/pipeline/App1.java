package edu.ntnu.idatt2001.lectures.fp.stream.pipeline;

import java.text.ParseException;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App1 {

  public static void main(String[] args) throws ParseException {
		List<Student> students = AppData.getData();

    students.stream()
             .filter(p -> p.getGender() == "F")
             .map(p-> p.getBirthday())
             .sorted()
             .forEach(s -> System.out.println(s));
  }
}
