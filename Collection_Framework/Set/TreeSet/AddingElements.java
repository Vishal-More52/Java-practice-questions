package Collection_Framework.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class AddingElements {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();

        // adding elements
        ts.add("G");
        ts.add("R");
        ts.add("A");
        ts.add("C");
        ts.add("E");
        ts.add("B");
        ts.add("D");

        System.out.println(ts);
    }
}
