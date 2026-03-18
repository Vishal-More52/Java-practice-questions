package OPPS.Inheritance;

class LivingThings {
    void breath(){
        System.out.println("breathing....");
    }
}
class Animal extends LivingThings{
    void eat(){
        System.out.println("Eating");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.breath();
    }
}