package fp.stream.reduce;



import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BinaryOperator;

import fp.binaryoperator.Item;

public class ReduceExampleMax2 {

  public static void main(String[] args) throws ParseException {

    ArrayList<Student> studenter = new ArrayList<Student>();
    studenter.add(new Student("Ole Petter", "Hansen", "1980/12/12", "Mann"));
    studenter.add(new Student("Ingrid", "Olsen", "1975/12/10", "Kvinne"));
    studenter.add(new Student("�se Marie", "Jensen", "1973/05/06", "Kvinne"));

    System.out.println("\nTradisjonell m�te: ");
    int maxAlder = 0;
    for (Student student : studenter) {
      int alder = student.getAlder();
      if (alder > maxAlder) {
        maxAlder = alder;
      }
    }
    System.out.println(maxAlder);

    System.out.println("\nLambda: ");

    Comparator<Integer> comp = new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o1 - o2;
      }
    };

    BinaryOperator<Integer> boMax = BinaryOperator.maxBy(comp);

    maxAlder = studenter.stream().map(s -> s.getAlder()).reduce((s1, s2) -> boMax.apply(s1, s2))
        .get();

    System.out.println(maxAlder);
    
    BinaryOperator<Integer> boMin = BinaryOperator.minBy(comp);
    int minAlder = studenter.stream().map(s -> s.getAlder()).reduce((s1, s2) -> boMin.apply(s1, s2))
        .get();

    System.out.println(minAlder);
    
  }
}
