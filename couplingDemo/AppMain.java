package couplingDemo;

import couplingDemo.looseCupling.EmailNotificationService;
import couplingDemo.looseCupling.NotificationService;
import couplingDemo.tightCupling.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight
        UserService userService = new UserService();
        userService.notifyUser("Order place");

        //Lose
        NotificationService emailService = new EmailNotificationService();
        couplingDemo.looseCupling.UserService userService1 = new couplingDemo.looseCupling.UserService(emailService);
        userService1.notifyUser("Order Processed!");


    }


}
