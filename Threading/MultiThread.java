package Threading;

import java.lang.Runnable;

class MultiThreads implements Runnable {
    private String taskName;

    public MultiThreads(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {

            //Threads.currentThread().getName() show which thread is working
            System.out.println(Thread.currentThread().getName() + " is performing " + taskName + " - Steo " + i);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        }
    }


}

public class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThreads("Payment Processing"), " Thread-1");
        Thread t2 = new Thread(new MultiThreads("Invoice Generation"), "Thread-2");
        Thread t3 = new Thread(new MultiThreads("Email Notification"), "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}

