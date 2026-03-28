package Collection_Framework.Vector;

import java.util.Vector;

public class IteratingTheVector {
    public static void main(String[] args) {
        
        // creating vector
        Vector<String> vector = new Vector<>();

        // adding elements
        vector.add("Vishal");
        vector.add("Sanjay");
        vector.add(0,"More");

        // Using for loop
        System.out.println("Using for loop");
        for(int i =0; i< vector.size();i++)
        {
            System.out.println( vector.get(i) + " ");
        }

        System.out.println();

        // using the Enhanced for loop
        System.out.println("using enhanced for loop");
        
        for(String str :vector){
            System.out.println(str + " ");
        }

        //using iterator
        
    }
}
