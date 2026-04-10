package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

      // Create a HashMap to store student ID and name
      Map<Integer,String> students = new HashMap<>();

      // Adding elements

      students.put(101,"Vishal");
      students.put(102, "Shubham");
      students.put(103,"Arman");
      students.put(103,"Tanjim");
      students.put(104,"Rohan");
      students.put(103,"Tanjim");

      // adding null key 
      students.put(null,"Tanjim");

      // adding null values
      students.put(105,null);
      students.put(106,null);
      


      //Accessing a value
      System.out.println("Student with id 103: " + students.get(103));  //here tanjim overides all the previous values of key 103

      //Iterating through the map
      for(Map.Entry<Integer,String> entry : students.entrySet()){
        System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
      }

      
    }

    // HashMap does not maintain any order of its elements.
    // HashMap allows one null key and multiple null values.
    //it maintain sorted order of keys
    // 
}
