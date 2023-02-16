package edu.ntnu.idatt2001.lectures.fp.sortering;



import java.util.Comparator;
import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class App {

  public static void main(String[] args) {


		List<Student> students = AppData.getData();

    System.out.println("Before sort");
    for (Student student: students) {
      System.out.println(student.toString());
    }
    
    students.sort(new Comparator<Student>() {
      @Override
      public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
      }
    });


    System.out.println("After sort");
    for (Student student: students) {
      System.out.println(student.toString());
    }

    System.out.println("Sort on lastname");
    students.sort((a, b) -> a.getLastname().compareTo(b.getLastname()));
    students.forEach(System.out::println);

    System.out.println("Sort on age");
    Comparator<Student> compSortAge = (Student s1, Student s2) -> s1.getAge() - s2.getAge();    
    students.sort(compSortAge);
    students.forEach(System.out::println);
  }
}
