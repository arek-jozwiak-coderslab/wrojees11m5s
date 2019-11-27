package pl.coderslab.app;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.coderslab.beans.HelloWorld;

@Configuration
@ComponentScan("pl.coderslab.beans")
public class AppConfigJava {

}
