package Collection_Framework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    Map<String,Integer> scores = new TreeMap<>();

    //adding elements
    scores.put("Zebra", 10);
    scores.put("Apple", 50);
    scores.put("Mango", 30);
    scores.put("Banana", 25);

    //key will be sorted in natural order (alphabetical order for strings)
    System.out.println("Scores in sorted order: " + scores);

    // adding null key will throw NullPointerException
    try {
      scores.put(null, 0);
      scores.put(null, 5);
    
    } catch (NullPointerException e) {
      System.out.println("Cannot add null key to TreeMap: " + e.getMessage());
    }

    // adding null value is allowed
      scores.put("Grapes",null);
      scores.put("Grapes", null);
      scores.put("Chiku", null);
          
      System.out.println("Scores after adding null values: " + scores);
    
  }

  // TreeMap maintains the natural ordering of its keys (sorted order).
  // TreeMap does not allow null keys but allows multiple null values.
  // TreeMap is generally slower than HashMap and LinkedHashMap due to the overhead of maintaining the sorted order.
  //it doent allow duplicate keys but allows duplicate values
}
