package Java8.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class EvenOddFromList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,2,5,8,64,2);

        System.out.println("Original list is : " + list);

        List<Integer> evens = list.stream().filter(n -> n%2==0).toList();
        System.out.println("Even numbers are : " + evens);

        List<Integer> odds = list.stream().filter(n -> n % 2 != 0).toList();
        System.out.println("Odd numbers are : " + odds);
    }
}
