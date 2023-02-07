package fp.stream.map;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fp.foreach.object.Student;


public class MapExample {

  public static void main(String[] args) {

    ArrayList<Student> studenter = new ArrayList<Student>();
    studenter.add(new Student("Ole Petter", "Hansen", 19801212, "Mann"));
    studenter.add(new Student("Ingrid", "Olsen", 197512101, "Kvinne"));
    studenter.add(new Student("�se Marie", "Jensen", 19730506, "Kvinne"));

    System.out.println("\nTradisjonell m�te: ");
    List<Integer> fDatoer = new ArrayList<Integer>();
    for (Student student : studenter) {
      fDatoer.add(student.getFdato());
    }
    System.out.println(fDatoer);

    System.out.println("\nLambda: ");
    fDatoer = studenter.stream().map(s-> s.getFdato()).toList();
    fDatoer.forEach(s -> System.out.println(s));
  }
}
