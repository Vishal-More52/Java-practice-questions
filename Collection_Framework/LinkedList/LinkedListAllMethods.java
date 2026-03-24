package Collection_Framework.LinkedList;

import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListAllMethods {

    public static void main(String[] args) {
        // ─────────────────────────────────────────────
        // 1. CREATING A LINKEDLIST
        // ─────────────────────────────────────────────
        LinkedList<String> list = new LinkedList<>();
        System.out.println("=== 1. Created empty LinkedList ===");
        System.out.println("List: " + list);
 
        // ─────────────────────────────────────────────
        // 2. ADDING ELEMENTS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 2. Adding Elements ===");
 
        list.add("Banana");           // adds at end
        list.add("Mango");
        list.add("Apple");
        System.out.println("After add():        " + list);
 
        list.addFirst("Grapes");      // adds at beginning
        System.out.println("After addFirst():   " + list);
 
        list.addLast("Papaya");       // adds at end
        System.out.println("After addLast():    " + list);
 
        list.add(2, "Orange");        // adds at specific index
        System.out.println("After add(2, ...):  " + list);
 
        list.offer("Pineapple");      // adds at end (Queue method)
        System.out.println("After offer():      " + list);
 
        list.offerFirst("Kiwi");      // adds at beginning (Deque method)
        System.out.println("After offerFirst(): " + list);
 
        list.offerLast("Watermelon"); // adds at end (Deque method)
        System.out.println("After offerLast():  " + list);
 
        list.push("Cherry");          // adds at front (Stack method)
        System.out.println("After push():       " + list);
 
        // ─────────────────────────────────────────────
        // 3. ACCESSING ELEMENTS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 3. Accessing Elements ===");
 
        System.out.println("get(0):      " + list.get(0));         // by index
        System.out.println("getFirst():  " + list.getFirst());     // first element
        System.out.println("getLast():   " + list.getLast());      // last element
        System.out.println("peek():      " + list.peek());         // first, null if empty
        System.out.println("peekFirst(): " + list.peekFirst());    // first, null if empty
        System.out.println("peekLast():  " + list.peekLast());     // last, null if empty
        System.out.println("element():   " + list.element());      // first, throws exception if empty
 
        // ─────────────────────────────────────────────
        // 4. SEARCHING ELEMENTS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 4. Searching Elements ===");
 
        System.out.println("contains('Mango'):     " + list.contains("Mango"));
        System.out.println("indexOf('Apple'):      " + list.indexOf("Apple"));
        System.out.println("lastIndexOf('Apple'):  " + list.lastIndexOf("Apple"));
        System.out.println("size():                " + list.size());
        System.out.println("isEmpty():             " + list.isEmpty());
 
        // ─────────────────────────────────────────────
        // 5. UPDATING ELEMENTS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 5. Updating Elements ===");
 
        System.out.println("Before set(): " + list);
        list.set(0, "Strawberry");    // replaces element at index 0
        System.out.println("After set(0, 'Strawberry'): " + list);
 
        // ─────────────────────────────────────────────
        // 6. REMOVING ELEMENTS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 6. Removing Elements ===");
 
        System.out.println("Before remove: " + list);
 
        String removed = list.remove();           // removes first element
        System.out.println("remove() returned: " + removed + " | List: " + list);
 
        String removedFirst = list.removeFirst(); // removes first element
        System.out.println("removeFirst() returned: " + removedFirst + " | List: " + list);
 
        String removedLast = list.removeLast();   // removes last element
        System.out.println("removeLast() returned: " + removedLast + " | List: " + list);
 
        list.remove("Mango");                     // removes by value
        System.out.println("After remove('Mango'): " + list);
 
        list.remove(1);                           // removes by index
        System.out.println("After remove(1): " + list);
 
        String polled = list.poll();              // removes first, null if empty
        System.out.println("poll() returned: " + polled + " | List: " + list);
 
        String pollFirst = list.pollFirst();      // removes first, null if empty
        System.out.println("pollFirst() returned: " + pollFirst + " | List: " + list);
 
        String pollLast = list.pollLast();        // removes last, null if empty
        System.out.println("pollLast() returned: " + pollLast + " | List: " + list);
 
        String popped = list.pop();               // removes first (Stack method)
        System.out.println("pop() returned: " + popped + " | List: " + list);
 
        // ─────────────────────────────────────────────
        // 7. ITERATION
        // ─────────────────────────────────────────────
 
        // Reset list for iteration demo
        list.clear();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");
 
        System.out.println("\n=== 7. Iterating the List ===");
 
        // Using for-each loop
        System.out.print("for-each loop:  ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
 
        // Using for loop with index
        System.out.print("for loop:       ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
 
        // Using Iterator
        System.out.print("Iterator:       ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
 
        // Using forEach with lambda
        System.out.print("forEach lambda: ");
        list.forEach(item -> System.out.print(item + " "));
        System.out.println();
 
        // Using descendingIterator (reverse order)
        System.out.print("descendingIterator (reverse): ");
        Iterator<String> descIt = list.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();
 
        // ─────────────────────────────────────────────
        // 8. CONVERTING TO ARRAY
        // ─────────────────────────────────────────────
        System.out.println("\n=== 8. Converting to Array ===");
 
        Object[] arr = list.toArray();
        System.out.print("toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
 
        String[] strArr = list.toArray(new String[0]);
        System.out.print("toArray(String[]): ");
        for (String s : strArr) {
            System.out.print(s + " ");
        }
        System.out.println();
 
        // ─────────────────────────────────────────────
        // 9. OTHER USEFUL METHODS
        // ─────────────────────────────────────────────
        System.out.println("\n=== 9. Other Useful Methods ===");
 
        System.out.println("List before clone: " + list);
 
        // clone() - creates a shallow copy
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList);
 
        // subList() - returns a view of a portion
        System.out.println("subList(1, 3): " + list.subList(1, 3));
 
        // toString()
        System.out.println("toString(): " + list.toString());
 
        // ─────────────────────────────────────────────
        // 10. USING AS STACK (LIFO)
        // ─────────────────────────────────────────────
        System.out.println("\n=== 10. LinkedList as Stack (LIFO) ===");
 
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after push 10, 20, 30: " + stack);
        System.out.println("pop(): " + stack.pop());
        System.out.println("Stack after pop: " + stack);
 
        // ─────────────────────────────────────────────
        // 11. USING AS QUEUE (FIFO)
        // ─────────────────────────────────────────────
        System.out.println("\n=== 11. LinkedList as Queue (FIFO) ===");
 
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        System.out.println("Queue after offer 100, 200, 300: " + queue);
        System.out.println("poll(): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
 
        // ─────────────────────────────────────────────
        // 12. CLEARING THE LIST
        // ─────────────────────────────────────────────
        System.out.println("\n=== 12. Clearing the List ===");
 
        System.out.println("Before clear: " + list);
        list.clear();
        System.out.println("After clear():  " + list);
        System.out.println("isEmpty() after clear: " + list.isEmpty());
    }
}

