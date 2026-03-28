package Collection_Framework.Vector;

import java.util.Vector;

public class UpdateElements {
    public static void main(String[] args) {
        
        // creating the vector

        Vector<Integer> vector = new Vector<>();

        // add elements
        vector.add(12);
        vector.add(42);
        vector.add(53);
        vector.add(12);
        vector.add(13);
        vector.add(null);

        // Displaying elements
        System.out.println("Vector : " + vector);

        // useig set() method to replace 13 with 30
        System.out.println("The Object that is replaced is: " + vector.set(4, 30));
        System.out.println("Vector : " + vector);

        // use set method to replce null with 100
        System.out.println("The Object that is replaced is: " + vector.set(5, 100));
        System.out.println("Vector : " + vector);

    }
}
