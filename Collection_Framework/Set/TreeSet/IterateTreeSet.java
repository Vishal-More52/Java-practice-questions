package Collection_Framework.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class IterateTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        // adding elements
        ts.add("Vishal");
        ts.add("R");
        ts.add("Sanjay");
        ts.add("C");
        ts.add("More");
        ts.add("B");
        ts.add("D");


        for(String value : ts)
            System.out.print(value + ", ");
        System.out.println();
    }
}
