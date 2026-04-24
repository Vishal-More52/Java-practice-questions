package Java8.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
  public static void main(String[] args) {
    List<String> names = List.of("Vishal", "Shubham","Arman");
    List<String> uppers = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    System.out.println(uppers);
  }
}
