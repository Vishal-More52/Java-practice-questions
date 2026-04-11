package Threading;

class  Counter {
  private  int count = 0;
  // 'Synchronized' ensures only one thread increments at a time
  public synchronized  void increment() {
    count++;

  }
  public int geCount(){
    return  count;

  }
}
public class SyncDemo {
  public static void main(String[] args) throws InterruptedException {

    Counter c = new Counter();
    Runnable task = () -> {
      for(int i =0 ; i < 10; i++){
        c.increment();
      }
    };
    
    Thread t1 = new Thread(task);
    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    t1.join();  //wai for t1 to finish
    t2.join(); //wait for t2 to finish

    System.out.println("Final Count: " + c.geCount());  // Should always print 20 due to synchronization
  }
}
