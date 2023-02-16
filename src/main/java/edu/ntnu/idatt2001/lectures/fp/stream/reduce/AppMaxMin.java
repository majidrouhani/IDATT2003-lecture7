package edu.ntnu.idatt2001.lectures.fp.stream.reduce;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class AppMaxMin {

  public static void main(String[] args) {

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


    //Find student with max/min age
    Comparator<Student> compItem = (s1, s2) -> s1.getAge() - s2.getAge();            
    BinaryOperator<Student> boMax = BinaryOperator.maxBy(compItem);
    BinaryOperator<Student> boMin = BinaryOperator.minBy(compItem);

    Student maxStudentAge = students.stream().reduce(boMax).get();    
    Student minStudentAge = students.stream().reduce(boMin).get();    

    System.out.println("Max age: "+maxStudentAge.toString());
    System.out.println("Min age: "+minStudentAge.toString());

    //Find only max age
    maxAge = students.stream().map(Student::getAge).reduce(Math::max).get();    
    System.out.println("Max age: "+maxAge);

    //Find only min age
    int minAge = students.stream().map(Student::getAge).reduce(Math::min).get();    
    System.out.println("Min age: "+minAge);
  }
}
