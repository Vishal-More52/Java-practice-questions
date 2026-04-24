package Java8.StreamApi;

import java.util.List;

public class CountOperation {
  public static void main(String[] args) {
    List<String> names = List.of("Vishal","Raj","Shubham","Arman","Vikas","Vilas");

    long count = names.stream()
          .filter(n -> n.startsWith("V"))
          .count();
    System.out.println(count);
  }
}
