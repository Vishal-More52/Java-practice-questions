package Threading;

import java.sql.SQLOutput;

class IsAliveDemo extends Thread{
    public void run()
    {
        System.out.println("isAlive method program");
    }
}
public class IsAliveMethod {
    public static void main(String[] args) {

        IsAliveDemo t1 = new IsAliveDemo();
        IsAliveDemo t2 = new IsAliveDemo();
        IsAliveDemo t3 = new IsAliveDemo();
//        System.out.println(t1.isAlive);

        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.isAlive());


    }
}
