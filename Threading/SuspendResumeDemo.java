package Threading;

class SuspenResumedemo extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i = 1 ; i <= 3; i++)
        {
            System.out.println(name);
        }
    }
}
public class SuspendResumeDemo  {
    public static void main(String[] args) throws InterruptedException {
        SuspenResumedemo t1 = new SuspenResumedemo();
        SuspenResumedemo t2 = new SuspenResumedemo();
        SuspenResumedemo t3 = new SuspenResumedemo();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();

        t2.start();
        t2.suspend(); // Thread 2 is paused here [00:01:06]

        t3.start();

        // Later in the code, we resume Thread 2
        t2.resume();
    }
}
