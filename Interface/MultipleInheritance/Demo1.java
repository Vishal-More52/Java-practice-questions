package Interface.MultipleInheritance;

interface Walkable{
  void walk();

}
interface Swimmable{
  void swim();
}
//implements the interfaces in a class

class Duck implements Walkable,Swimmable{
  public void walk(){
    System.out.println("Duck is walking");

  }
  public void swim(){
    System.out.println("Duck is swimming");
  }

  public static void main(String[] args) {
    Duck duck = new Duck();
    duck.walk();
    duck.swim();
  }
}