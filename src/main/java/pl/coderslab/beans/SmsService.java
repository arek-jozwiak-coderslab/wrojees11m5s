package pl.coderslab.beans;

public class SmsService implements NotificationService {
    public void send(){
        System.out.println("sending sms");
    }
}
