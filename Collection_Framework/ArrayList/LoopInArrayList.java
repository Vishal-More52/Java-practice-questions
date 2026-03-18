package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopInArrayList {
        public static void main(String[] args) {
            
            List<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);

            System.out.println(list);

            System.out.println("-----Using For loop ---------");

            for(int i =0 ; i<list.size();i++){
                System.out.println("the element is "+list.get(i));
            }

            System.out.println("--------- using for each loop-------");
            for(Integer element : list){
                System.out.println("Foreach elements is :"+element);
            }

            System.out.println("----------- Using Iterator --------");

            Iterator<Integer> it = list.iterator();

            while (it.hasNext()) {
                System.out.println("iterator :"+it.next());
                
            }
        }
}
