package Collection_Framework.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class RemoveElements {
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet<>();


        // adding elements
        lh.add("Vishal");
        lh.add("Sanjay");
        lh.add("More");
        lh.add("A");
        lh.add("B");

        System.out.println(" " + lh);

        // removing the elements from above set
        lh.remove("B");

        // Again removing the element
        System.out.println("After removing element " + lh);

        // return false if the element is not present
        System.out.println(lh.remove("AC"));

    }
}
