package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.EmailService;
import pl.coderslab.beans.HelloWorldDao;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        MessageSender messageSenderSms = context.getBean("messageSenderSms", MessageSender.class);
        messageSenderSms.sendMessage();
        messageSender.sendMessageFromProperty();
        context.close();
    }
}