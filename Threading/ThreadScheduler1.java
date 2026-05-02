package Threading;

class ThreadScheduler extends Thread{

    public void run(){

    String n = Thread.currentThread().getName();
    for(int i =1 ; i<=3; i++){
        System.out.println(n);
    }

    }
}
public class ThreadScheduler1 {
    public static void main(String[] args) {
        ThreadScheduler t1 = new ThreadScheduler();
        ThreadScheduler t2 = new ThreadScheduler();
        ThreadScheduler t3 = new ThreadScheduler();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
