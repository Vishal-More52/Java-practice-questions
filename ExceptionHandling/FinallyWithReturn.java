package ExceptionHandling;

public class FinallyWithReturn {
  public static int test(){
    try {
      return  1;
    } finally{
      return 2; //finally  overrides the try's return

    }
  }

  public static void main(String[] args) {
    System.out.println(test());  //Output: 2
  }
}
