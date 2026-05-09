package Threading;


class DemoA extends Thread{
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i = 1 ; i<=3 ; i++){
            System.out.println(n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadMethod {
    public static void main(String[] args) {
        DemoA t1 = new DemoA();
        DemoA t2 = new DemoA();
        DemoA t3 = new DemoA();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
