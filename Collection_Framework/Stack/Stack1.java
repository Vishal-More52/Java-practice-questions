package Collection_Framework.Stack;

import java.util.Stack;

public class Stack1  {
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();

        animals.push("dog");
        animals.push("cat");
        animals.push("hourse");
        animals.push("cow");

        System.out.println("Stack : "+animals);
    }

    
}
