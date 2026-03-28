package Collection_Framework.Vector;

import java.util.Vector;

public class VectorCapacity {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(2); //initial capacity = 2
        System.out.println("Initial Capacity: " + vector.capacity());
        
        // Add elemets to trigger capacity increase
        vector.add(10);
        vector.add(20);
        System.out.println("Capacity after adding two elements: " + vector.capacity());
        
        // Adding third elements
        vector.add(30);  //Triggers resize (2 -> 4)
        System.out.println("Capacity after adding 3rd element: " + vector.capacity());

        //Adding 2 more elements
        vector.add(40);
        vector.add(50);  //triggers resize again ( 4 -> 8 )
        System.out.println("Capacity After adding 5 elements: " + vector.capacity());
        
        

  
    }
}
