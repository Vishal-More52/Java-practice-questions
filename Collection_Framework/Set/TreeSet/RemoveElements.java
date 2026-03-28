package Collection_Framework.Set.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RemoveElements {
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<>();
        // adding elements
        ts.add("Vishal");
        ts.add("R");
        ts.add("Sanjay");
        ts.add("C");
        ts.add("More");
        ts.add("B");
        ts.add("D");

        System.out.println("Initail TreeSet: " + ts);

        // removing a specific existing elements inserted
        // above
        ts.remove("R");

        // print the updated Tree
        System.out.println("After removing element : " + ts);
    }
}
