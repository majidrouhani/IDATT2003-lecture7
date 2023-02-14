package edu.ntnu.idatt2001.lectures.fp.stream.reduce;



import java.text.ParseException;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class AppMax2 {

  public static void main(String[] args) throws ParseException {

		List<Student> students = AppData.getData();

    Comparator<Integer> comp = (o1, o2) -> o1-o2;

    BinaryOperator<Integer> boMax = BinaryOperator.maxBy(comp);

    int maxAge = students.stream().map(s -> s.getAge()).reduce((s1, s2) -> boMax.apply(s1, s2)).get();
    System.out.println(maxAge);

    BinaryOperator<Integer> boMin = BinaryOperator.minBy(comp);
    int minAge = students.stream().map(s -> s.getAge()).reduce((s1, s2) -> boMin.apply(s1, s2)).get();

    System.out.println(minAge);    
  }
}
