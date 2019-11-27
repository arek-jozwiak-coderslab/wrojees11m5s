package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.MessageSender;

public class SpringDiApplicationJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello();

        context.close();
    }
}