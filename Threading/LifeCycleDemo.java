package Threading;

class SharedResource{
  public synchronized void waitForSignal(){
    try {
      System.out.println("Thread waiting...");
      wait(); //Realses the lock and wait
      System.out.println("Thread resumed!");

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public synchronized  void giveSignal(){
    notify();   //Wakes up a waiting thread
      System.out.println("Signal sent.");
  }
}
public class LifeCycleDemo {
  public static void main(String[] args) throws InterruptedException {
    SharedResource res = new SharedResource();

    Thread t1 = new Thread(res::waitForSignal);
    t1.start();

    Thread.sleep(2000); // Main thread sleeps for 2 seconds

    Thread t2 = new Thread(res::giveSignal);
    t2.start();
  }
}
