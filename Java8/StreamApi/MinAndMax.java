package Java8.StreamApi;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,2,5,8,64,2,0);

        System.out.println("Full list is : " + list);

        int min = list.stream().min(Integer::compareTo).get();
        System.out.println("Minimum element : " + min);

        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("Maximum element : " + max);

    }
}
