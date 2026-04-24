package Java8.UsingLambda;

public class Main {
  public static void main(String[] args) {
    
    Myinter i = () ->{
      System.out.println("Say Hello from method 1");
    };
    Myinter i2 = () ->{
      System.out.println("Say hello from methid 2");
    };
    i.sayHello();
    i2.sayHello();


    // lambda for SumInter Interface
    SumInter sumInter = (a,b) -> a + b;
    System.out.println(sumInter.sum(5, 4)); 
    System.out.println(sumInter.sum(4, 8)); 
    System.out.println(sumInter.sum(2, 7));
    
    
    // lambda for StringInter to find length of string

    StringInter stringInter = str -> str.length();
    System.out.println("Length of Stirng is: "+ stringInter.String("Vishal More"));



  }

}
