package Collection_Framework.Map.MapPrograms;

import java.util.HashMap;
import java.util.Map;

public class MapCreation {
    public static void main(String[] args) {
        
        Map<String,Integer> m = new HashMap<>();

        m.put("Vishal", 1);
        m.put("Sanjay", 2);
        m.put("More", 3);
        System.out.println(m);

    }
}
