//Abstract class
abstract class Animal {

    //Abstract method does not have a body
    public abstract void animalSound();

    // regular method
    public void sleep(){
        System.out.println("Zzz");

    }


}

//Subclass (inherit from Animal)
class Pig extends Animal{

    //the body of animalSound() is provided here
    public void animalSound(){

        System.out.println("The Pig Say : wee wee");
    }
}

public class Abstract1{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
