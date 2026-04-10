package Collection_Framework.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
  public static void main(String[] args) {
    
    // creating LInkedHashMap
    Map<String,Double> prices = new LinkedHashMap<>();
    prices.put("Apple",20.10);
    prices.put("Orange",12.75);
    prices.put("Banana",15.50);

    //adding null key
    prices.put(null, 5.00);
    // adding null value
    prices.put("Grapes", null);

    //adding duplicate keys 
    prices.put("Grapes", 8.25);
    prices.put("Grapes", 9.00);
    prices.put("Grapes", 7.50);

    //adding duplicate values
    prices.put("Mango", 12.75);
    prices.put("Pineapple", 12.75);
    prices.put("Strawberry", 12.75);






    //Acccessing values
    System.out.println("Price in insertion order:" + prices);

  }
  // LinkedHashMap maintains the insertion order of its elements.
  // LinkedHashMap allows one null key and multiple null values.
  // LinkedHashMap is generally slower than HashMap due to the additional overhead of maintaining the order.
  //LinkedHashMap is good choice when you need to maintaing the order of elements while still having fast access to values based on keys.
  // It is often used in scenarios like caching, where the order of access is important.
  //it does not maintain sorted order of keys
  //it doesnt allow duplicate keys but allows duplicate values
}
