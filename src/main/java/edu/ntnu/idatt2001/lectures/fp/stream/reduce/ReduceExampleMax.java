package fp.stream.reduce;

import java.text.ParseException;
import java.util.ArrayList;

public class ReduceExampleMax {

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
    maxAlder = studenter.stream().map(s -> s.getAlder()).reduce(Math::max).get();    
    System.out.println(maxAlder);

    int minAlder = studenter.stream().map(s -> s.getAlder()).reduce(Math::min).get();    
    System.out.println(minAlder);

  }
}
