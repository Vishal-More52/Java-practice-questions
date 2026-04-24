package Java8.StreamApi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorOperation {
  public static void main(String[] args) {
    List<String> names = List.of("Vishal","Raj","Shubham","Arman");

    //to list 
    List<String> list = names.stream()
              .collect(Collectors.toList());
    System.out.println(list);

    // to set (remove duplicates) and in sorted order
    Set<String> set = names.stream()
            .collect(Collectors.toSet());
    System.out.println(set);

    // joing in to one string

    String joined = names.stream()
            .collect(Collectors.joining(", "));
    System.out.println(joined);

    // group by letters
    Map grouped = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
    System.out.println(grouped);
  }

  
}
