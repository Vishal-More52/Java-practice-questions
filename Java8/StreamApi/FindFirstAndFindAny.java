package Java8.StreamApi;

import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {
  public static void main(String[] args) {
    List<String> names = List.of("Vishal","Raj","Shubham","Arman","Vishal","Vikas");
    Optional<String> first = names.stream()
            .filter(n -> n.startsWith("V"))
            .findFirst();
    first.ifPresent(System.out::println);

    Optional<String> findAny = names.stream()
            .filter(n -> n.contains("V"))
            .findAny();

    findAny.ifPresent(System.out::println);
  }
}
