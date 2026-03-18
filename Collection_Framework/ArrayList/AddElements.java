package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddElements {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);

        System.out.println(list);

        System.out.println("----------------------------------");
        System.out.println("Add element on index");
        list.add(1,10);
        System.out.println(list);

        System.out.println("-----------------------------------");
        System.out.println("Adding element from new list");
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(200);
        list.addAll(newList);
        System.out.println(list);

        System.out.println("-------Get element ----------");
        System.out.println(list.get(2));

        System.out.println(" ----------remove element----------");
        list.remove(1);
        System.out.println(list);

        System.out.println("-----------update element--------");
        list.set(2, 1000);
        System.out.println(list);
    }
}

