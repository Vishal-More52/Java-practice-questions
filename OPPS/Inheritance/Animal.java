package OPPS.Inheritance;

public class Animal {
    String name;
    int age;

    void eat(){
        System.out.println("Dog is eating..");
    }

    Animal(String n,int a)
    {
        name = n;
        age = a;
    }

}

class Dog extends Animal{

    Dog(String n, int a) {
        super(n, a);
    
    }

    void bark(){
        System.out.println("Dog is barking..");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Vishal",23);
        d1.eat();

        Dog d2 = new Dog("dfds",43);
        d2.bark();
    }

    
}
