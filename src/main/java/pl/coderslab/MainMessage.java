package pl.coderslab;

import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.SmsService;

public class MainMessage {

    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender(new EmailService());
        MessageSender messageSender2 = new MessageSender(new SmsService());
        messageSender2.sendMessage();
        messageSender.sendMessage();


    }
}
