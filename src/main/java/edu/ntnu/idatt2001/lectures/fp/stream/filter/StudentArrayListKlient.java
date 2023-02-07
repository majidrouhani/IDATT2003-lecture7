package fp.stream.filter;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fp.foreach.object.Student;

public class StudentArrayListKlient {

  public static void main(String[] args) {

    ArrayList<Student> studenter = new ArrayList<Student>();

    Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
    Student student2 = new Student("Ingrid", "Olsen", 19751210, "Kvinne");
    Student student3 = new Student("�se Marie", "Jensen", 19730506, "Kvinne");

    studenter.add(student1);
    studenter.add(student2);
    studenter.add(student3);

    System.out.println("\nTradisjonell m�te: ");
    List<Student> kvinner = new ArrayList<Student>();
    for (Student student : studenter) {
      if (student.getKjoenn() == "Kvinne") {
        kvinner.add(student);
      }
    }
    System.out.println(kvinner);

    System.out.println("\nMed lambda: ");
    kvinner = studenter.stream()
                       .filter(p -> p.getKjoenn() == "Kvinne")
                       .toList();
    kvinner.forEach(s -> System.out.println(s));
  }
}
