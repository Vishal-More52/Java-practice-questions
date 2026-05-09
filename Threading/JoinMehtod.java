package Threading;
class JoinDemo extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        for (int i = 1; i<=3; i++){
            System.out.println(name);

        }
    }
}
public class JoinMehtod {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();
        JoinDemo t3 = new JoinDemo();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.join();
        t2.join();
        t3.join();

        t1.start();
        t2.start();
        t3.start();
    }
}
