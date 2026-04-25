package Java8.MethodReferences;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(21,43,23,12,434,2,23,43,54);

        //print in normal way usin S.O.P
        System.out.println(integers);

        //print using method reference in stream
        integers.stream().sorted().forEach(System.out::println);

    }
}
