package Java8.StreamApi;

import java.util.List;

public class ReduceOperation {
  public static void main(String[] args) {
    List<Integer> nums = List.of(1,2,3,4,5);

    int sum = nums.stream()
              .reduce(0,Integer::sum);
    
              System.out.println(sum);
      
      //manully
      int sum2 = nums.stream()
            .reduce(0, (a,b) -> a + b);
        System.out.println(sum2);

  }
}
