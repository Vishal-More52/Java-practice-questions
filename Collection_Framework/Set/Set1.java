package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(53);
        set.add(3);
        set.add(2);
        set.add(43);
        System.out.println(set);

        set.add(2);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        System.out.println("----- check is this no contain in set-------");
        System.out.println(set.contains(25));
        System.out.println(set.contains(2));

        System.out.println("------ check is set is empty ------");
        System.out.println(set.isEmpty());
        System.out.println("------ check size of set ------");
        System.out.println(set.size());

        System.out.println("-----clear set -----");
        set.clear();
        System.out.println(set);
    }
}
