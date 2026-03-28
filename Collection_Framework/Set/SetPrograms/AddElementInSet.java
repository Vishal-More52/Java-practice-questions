package Collection_Framework.Set.SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class AddElementInSet {
    public static void main(String[] args) {
        
        Set<String> s = new HashSet<>(); 
            s.add("B");
            s.add("B");
            s.add("C");
            s.add("A");
            s.add(null);
            s.add(null);
            s.add(  " ");
            
            System.out.println(s);
    
    }
}
