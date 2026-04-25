package Java8.MethodReferences;

public class RefDemo {
    public static void main(String[] args) {
        System.out.println("Learning method reference");

        //refer the priviously wridden static method doTask()
        WorkInter workInter = Stuff::doStuff;


        workInter.doTask();

        //creating thread in stuff class and refering it
        //className :: methodName
        Runnable runnable = Stuff ::threadTask;
        Thread d = new Thread(runnable);
        d.start();

        // Refering a non-static method
        //Object :: methodName
        Stuff ob = new Stuff();
        Runnable rn = ob::printNumbers;
        Thread d2 = new Thread(rn);
        d2.start();
    }
}
