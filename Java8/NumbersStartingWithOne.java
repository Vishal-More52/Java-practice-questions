package Java8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NumbersStartingWithOne{
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

    list.stream()
        .map(s -> s + "")   //convert to string
        .filter(s -> s.startsWith("1"))
        .forEach(System.out::println);
    

        /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,32}; */

        int[] arr = {10,15,8,49,25,98,32};

        List<String> list1 = Arrays.stream(arr).boxed()
                                    .map(s -> s + "")
                                    .filter(s -> s.startsWith("1"))
                                    .collect(Collectors.toList());
        System.out.println(list1);
  }
}