package Collection_Framework.Set.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AccessingElements {
    public static void main(String[] args) {

        NavigableSet<String> ts = new TreeSet<>();
        // adding elements
        ts.add("G");
        ts.add("R");
        ts.add("A");
        ts.add("C");
        ts.add("E");
        ts.add("B");
        ts.add("D");

        System.out.println("TreeSet is : " + ts);
        String check1 = "Z";
        String check2 = "A";

        // check iof the above string exists in the treeset
        // or not

        System.out.println("check iof the above string exists in the treeset or not :");
        System.out.println("Contains " + check1 + " " + ts.contains(check1));
        System.out.println("Contains " + check2 + " " + ts.contains(check2));

        System.out.println();
        System.out.println("Print the first elemet in treeSet:");
        System.out.println("First value : " + ts.first());

        System.out.println();
        System.out.println("Print the Last value in treeset");
        System.out.println("Last Value : " + ts.last());
        

    }
}
