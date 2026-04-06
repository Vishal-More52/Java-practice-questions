package ExceptionHandling;

public class TryWithResources {
  
  //Custom resource implementing AutoCloseable

  static class MyResource implements AutoCloseable{

    public MyResource(){
      System.out.println("Resource opened");
    }

    public void use(){
      System.out.println("Resource in use");

    }
    @Override
    public void close(){
      System.out.println("Resource closed automatically");
    }
  }

  public static void main(String[] args) {
    try(MyResource res = new MyResource()){
      res.use();
    } // close() is called automatically
  }
}
