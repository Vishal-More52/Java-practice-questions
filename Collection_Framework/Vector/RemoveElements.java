package Collection_Framework.Vector;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.Vector;

public class RemoveElements {
    public static void main(String[] args) {
        //Creating the default vector of capacity 10
        Vector vector = new Vector();

        // Adding elements
        vector.add(1);
        vector.add(2);
        vector.add("Vishal");
        vector.add(21);
        vector.add("More");
        vector.add(3);

        // remove firs occurrence element at 1
        vector.remove(1);   

        System.out.println("After removal : " + vector);

    }
}
