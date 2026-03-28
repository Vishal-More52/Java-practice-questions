package Collection_Framework.Vector;

import java.util.Vector;

public class AddingElements {
    public static void main(String[] args) {
        
        // creating the default vector
        Vector v1 = new Vector();

        // Adding custome elements using add method
        v1.add(1);
        v1.add(2);
        v1.add("Vishal");
        v1.add(4);
        v1.add(5);

        System.out.println("Vector 1 is : " + v1);


        //creating generic vector
        Vector<Integer> v2 = new Vector<>();

        // adding custome elements using add() method
        v2.add(1);
        v2.add(2);
        v2.add(3);
    

        System.out.println("Vector v2 is : " + v2);
    }
}
