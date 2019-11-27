package pl.coderslab;

import pl.coderslab.beans.NotificationService;

public class MessageSender {
    private NotificationService emailService;

    public MessageSender(NotificationService emailService) {
        this.emailService = emailService;
    }

    public void sendMessage(){
        emailService.send();
    }
}
