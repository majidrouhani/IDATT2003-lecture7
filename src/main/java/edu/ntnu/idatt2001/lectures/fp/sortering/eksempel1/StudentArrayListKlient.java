package edu.ntnu.idatt2001.lectures.fp.sortering.eksempel1;



import java.util.ArrayList;
import java.util.Comparator;

public class StudentArrayListKlient {

  public static void main(String[] args) {

    // Definer listen studenter.
    ArrayList<Student> studenter = new ArrayList<Student>();

    Student student1 = new Student("Ole Petter", "Hansen", 19801212, "Mann");
    Student student2 = new Student("Ingrid", "Olsen", 19751210, "Kvinne");
    Student student3 = new Student("�se Marie", "Jensen", 19730506, "Kvinne");

    studenter.add(student1);
    studenter.add(student2);
    studenter.add(student3);

    System.out.println("\nF�r sortering:");
    studenter.forEach(s -> System.out.println(s));

    System.out.println("\nSortering (tradisjonell m�te):");
    studenter.sort(new Comparator<Student>() {
      @Override
      public int compare(Student a, Student b) {
        return a.getNavn().compareTo(b.getNavn());
      }
    });
    System.out.println(studenter);

    System.out.println("\nSortering (med lambda:");
    studenter.sort((a, b) -> a.getNavn().compareTo(b.getNavn()));
    studenter.forEach(s -> System.out.println(s));

    System.out.println("\nSortering p� f�dselsdato (med lambda:");
    studenter.sort((a, b) -> b.getFdato() - a.getFdato());
    studenter.forEach(s -> System.out.println(s));

  }
}
