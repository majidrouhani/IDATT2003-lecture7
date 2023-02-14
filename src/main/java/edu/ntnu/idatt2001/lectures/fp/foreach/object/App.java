package edu.ntnu.idatt2001.lectures.fp.foreach.object;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App {

  public static void main(String[] args) {

		List<Student> students = new ArrayList<>();
		students = AppData.getData();

    System.out.println("\nUtskrift UTEN bruk av lambda:");
		for (Student student : students) {
			System.out.println(student.getUniqueIdasString());
		}

    System.out.println("\nUtskrift MED bruk av lambda alt 1:");
    students.forEach(p -> System.out.println(p));

    System.out.println("\nUtskrift MED bruk av lambda alt 2:");
    Consumer<Student> out = (s) -> System.out.println(s);
    students.forEach(out);
  }
}
