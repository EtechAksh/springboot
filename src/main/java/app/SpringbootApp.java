package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * A springboot app doesn't need to be deployed separately on a server
 * but it requires a 'main' method which will be start the servlet container, host the app etc.
 *
 * @SpringBootApplication - will tell spring that this class is the starting point for our app */
@SpringBootApplication
public class SpringbootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApp.class, args);
    }
}

















/**
 * Our main method delegates to Spring Boot’s SpringApplication class by calling run.
 *
 * SpringApplication bootstraps our application, starting Spring, which, in turn, starts the auto-configured Tomcat web server.
 *
 *
 *
 * In Spring:
 *
 * public static void main(String[] args) {
 *       ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
 *       HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
 *       obj.getMessage();
 *
 *       log.info("Exiting the program");
 *    }
 *
 *
 *
 *
 */