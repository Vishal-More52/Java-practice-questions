package Java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


// this gives the duplicate elements from the list
public class DuplicateElements {
  public static void main(String[] args) {
    
    List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,2,2,111,111,11,0,0,0,null,null);
    Set<Integer> set = new HashSet<>();
    myList.stream()
          .filter(n -> !set.add(n))
          .forEach(System.out::println);


  }
}
