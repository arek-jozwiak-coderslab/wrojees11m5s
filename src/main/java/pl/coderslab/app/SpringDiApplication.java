package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorldDao;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HelloWorldDao helloWorldDao = (HelloWorldDao)
                context.getBean("helloWorldDao");

        helloWorldDao.printMessage();

        context.close();
    }
}