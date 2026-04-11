package Threading;

// Method 1: Implementing Runnable (Recommended)
class MyRunnable implements Runnable {
  public void run() {
      System.out.println("Runnable Thread is running: " + Thread.currentThread().getName());
  }
}

// Method 2: Extending Thread
class MyThread extends Thread {
  public void run() {
      System.out.println("Extended Thread is running: " + this.getName());
  }
}
public class CreatingThread {

  public static void main(String[] args) {
    //Start Runnable
    Thread t1 = new Thread(new MyRunnable());
    t1.start();

    //Start Extendied Thread
    MyThread t2 = new MyThread();
    t2.start();
  }
}
