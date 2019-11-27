package pl.coderslab.beans;

public class EmailService implements NotificationService {
    public void send(){
        System.out.println("sending email");
    }
}
