package Java8.StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {
  
  public static void main(String[] args) {
    
    List<Integer> nums = List.of(1,2,3,4,5,6,7);
    List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

    System.out.println(evens);
  }
}
