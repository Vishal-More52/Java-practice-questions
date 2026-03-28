package Collection_Framework.Set.SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class AccessTheElements {
    
    public static void main(String[] args) {
        
        // creating set
        
        Set<String> s = new HashSet<>();
        
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("A");

        System.out.println("SEt is: " + s);

        String h = "D";

        System.out.println("Contains " + s + " " + s.contains(h));

    }
}
