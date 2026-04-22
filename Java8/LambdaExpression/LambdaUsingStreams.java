package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LambdaUsingStreams {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Rohan","Vishal","Shubham","Arman","Tanjim","Rohan");

    System.out.println("All names: ");
    names.forEach( name -> System.out.println(name));

    System.out.println("\nNames Starting wiht 'V");
    names.stream()
    .filter(n -> n.startsWith("R"))
    .map(n -> n.toUpperCase())
    .forEach(System.out::println);

  }
}
