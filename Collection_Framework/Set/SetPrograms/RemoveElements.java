package Collection_Framework.Set.SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveElements {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        // adding elements
        s.add("A");
        s.add("B");
        s.add("A");
        s.add("C");
        s.add("E");
        s.add("D");

        System.out.println("Initial HashSet: " +s);

        // removing elements using remove method

        s.remove("A");
        System.out.println("After removing element: "+s);
    }
}
