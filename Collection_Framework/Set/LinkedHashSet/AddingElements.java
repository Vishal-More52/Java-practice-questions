package Collection_Framework.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class AddingElements {
    public static void main(String[] args) {
        
        // creating linkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<>();
        lh.add("Vishal");
        lh.add("Sanjay");
        lh.add("More");

        System.out.println("LInkedHashSet: " + lh);
    }
}
