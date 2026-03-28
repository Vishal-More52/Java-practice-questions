package Collection_Framework.Set.SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class IteratingElements {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        // adding elements
        s.add("A");
        s.add("B");
        s.add("F");
        s.add("C");
        s.add("E");
        s.add("D");

        // Iterating throught the set via for-each loop

        for(String value : s)
        {
            System.out.print(value + ",");
        }
        System.out.println();
    }
}
