package Collection_Framework.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratingThroughLinkedList {
    public static void main(String[] args) {
        Set<String> lh = new LinkedHashSet<>();

        // adding elements
        lh.add("Vishal");
        lh.add("Sanjay");
        lh.add("More");
        lh.add("A");
        lh.add("B");


        System.out.println("Using Iterator");
        Iterator itr = lh.iterator();

        while (itr.hasNext()) 
            System.out.print(itr.next() + ", ");

        System.out.println();

        System.out.println("Using For each loop");
        for(String s : lh)
            System.out.print(s+ ", ");

        System.out.println();

            
        

    }
}
