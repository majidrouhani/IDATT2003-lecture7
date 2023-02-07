package fp.stream.pipeline;

import java.text.ParseException;
import java.util.ArrayList;

import fp.stream.reduce.Student;

public class PipelineExample1 {

  public static void main(String[] args) throws ParseException {
    ArrayList<Student> studenter = new ArrayList<Student>();
    studenter.add(new Student("Ole Petter", "Hansen", "1980/12/12", "Mann"));
    studenter.add(new Student("Ingrid", "Olsen", "1975/12/10", "Kvinne"));
    studenter.add(new Student("�se Marie", "Jensen", "1973/05/06", "Kvinne"));

    studenter.stream()
             .filter(p -> p.getKjoenn() == "Kvinne")
             .map(p-> p.getAlder())
             .sorted()
             .forEach(s -> System.out.println(s));
  }
}
