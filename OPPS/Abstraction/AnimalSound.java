abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dogs is barking");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat is muaining");
    }
}
class Cow extends Animal{
    public void makeSound(){
        System.out.println("Cow");
    }
}
public class AnimalSound {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
        Cow cw = new Cow();
        cw.makeSound();
    }
}
