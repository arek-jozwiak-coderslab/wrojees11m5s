package pl.coderslab.beans;

public class SmsService implements MessageService {
    @Override
    public void send() {
        System.out.println("sending sms");
    }

    @Override
    public void send(String message) {
        System.out.println("message  " + message);
    }
}
