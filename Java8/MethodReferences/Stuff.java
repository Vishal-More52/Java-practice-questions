package Java8.MethodReferences;

import java.time.LocalDate;

public class Stuff {
    public static void doStuff(){
        System.out.println("Doing task");
        System.out.println("Im second line");
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }

    //adding thread to print the table
    public static void threadTask(){
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(i * 2);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //creating a non-static method
    public void printNumbers(){
        for(int i =0 ; i <=5 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }


    }


}
