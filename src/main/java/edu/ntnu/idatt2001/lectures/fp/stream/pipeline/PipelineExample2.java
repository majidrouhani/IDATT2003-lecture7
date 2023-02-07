package fp.stream.pipeline;

import java.util.Arrays;
import java.util.List;

public class PipelineExample2 {

  public static void main(String[] args) {
    List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1", "c0");

    myList.stream()
          .filter(s -> s.startsWith("c"))
          .map(s-> s.toUpperCase())
          .sorted()
          .forEach(s -> System.out.println(s));
  }
}
