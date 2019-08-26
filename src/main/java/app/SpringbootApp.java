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





/*






//1. About springboot
// about pom.xml - https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-dependencies
// start the app without any mapping ---show default error
// Tomcat started, dispatcherServlet??
// hello world program   -- @restcontroller vs @controller  - https://javarevisited.blogspot.com/2017/08/difference-between-restcontroller-and-controller-annotations-spring-mvc-rest.html
//https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-annotations


// explain the project without db
//jpa   -- with db
*/
