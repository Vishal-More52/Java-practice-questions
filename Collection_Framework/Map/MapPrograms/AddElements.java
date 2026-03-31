package Collection_Framework.Map.MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class AddElements {

    public static void main(String[] args) {
        Map<Integer,String> hm1 = new HashMap<>();
        hm1.put(1,"Vishal");
        hm1.put(3,"More");
        hm1.put(2,"Sanjay");

        System.out.println(hm1);

    }
    
}