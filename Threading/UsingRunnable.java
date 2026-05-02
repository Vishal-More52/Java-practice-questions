package Threading;
import  java.lang.Runnable;
class MyTest implements Runnable{

    @Override
    public void run(){
        System.out.println("Task is running in: " + Thread.currentThread().getName());
    }
}
public class UsingRunnable {
    public static void main(String[] args) {

       MyTest test = new MyTest();
       Thread t = new Thread(test);
       t.start();
    }
}
