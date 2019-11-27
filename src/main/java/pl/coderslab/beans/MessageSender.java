package pl.coderslab.beans;

public class MessageSender {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("SET MESSAGE");
        this.message = message;
    }

    private final MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty(){
        messageService.send(this.message);
    }
}

