package Java8.StreamApi;

import java.util.List;

public class ForEachOperation {
  public static void main(String[] args) {
    List<String> names = List.of("Vishal","Shubham","Arman");
    names.stream()
      .forEach(name -> System.out.println("Hello ," + name));
  }
}
