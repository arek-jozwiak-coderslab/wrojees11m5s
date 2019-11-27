package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;
import pl.coderslab.beans.Person;
import pl.coderslab.beans.PersonService;

public class SpringDiApplicationJavaAuto {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfigJava.class);
        PersonService personService = context.getBean(PersonService.class);
        Person personById = personService.getPersonById(2l);
        System.out.println(personById.getFirstName());
        context.close();
    }
}