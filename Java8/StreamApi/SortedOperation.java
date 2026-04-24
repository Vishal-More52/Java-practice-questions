package Java8.StreamApi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOperation {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1,3,2,5,8,4,9);

    List<Integer> sorted = nums.stream()
                  .sorted()
                  .collect(Collectors.toList());
    System.out.println(sorted);

    //Reverse Order

    List<Integer> reverse = nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    System.out.println(reverse);
  }
}
