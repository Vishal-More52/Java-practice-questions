package OPPS.Inheritance.MultipleInheritance;



// Q1.
// Create a class Animal with a method breathe().
// Extend it with Mammal which adds a method feedMilk().
// Extend Mammal with Dog which adds a method bark().
// Create an object of Dog and call all three methods.

class Animal{
  void breathe(){
    System.out.println("Animal is breatheing");
  }
}

class Mammal extends  Animal{
  void feedMilk(){
    System.out.println("mammal is feed milk");
  }
}
class Dog extends Mammal{
  void bark(){
    System.out.println("Dog is barking");
  }
}

public class Q1 {

  public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();
    d.feedMilk();
    d.breathe();
  }
}
