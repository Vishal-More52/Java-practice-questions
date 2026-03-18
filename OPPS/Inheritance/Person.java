package OPPS.Inheritance;

public class Person {
    String name;

    Person(String n)
    {
        name = n;
    }

    void greet(){
        System.out.println("Good Morning Sir ,I am "+name+" Let Start coding");
    }
}
class Student extends Person{

    Student(String n) {
        super(n);
    
    }

    void study(){
        System.out.println("I am now Studing the Inheritance topic");

    }

    public static void main(String[] args) {
        Student s = new Student("Vishal");
        s.greet();
        s.study();
    }

}
