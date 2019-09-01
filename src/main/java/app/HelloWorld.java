package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import app.student.Student;

@RestController //-- means it will be scanned as a bean
public class HelloWorld {

    @RequestMapping("/helloWorld")    //{{host}}:8080/helloWorld
    // @RequestMapping("/")
    public String getHelloWorld() {
        return "Hello World";
    }


    //Example of returning an Object
    @RequestMapping("/student")
    public Student getStudent() {
        return new Student(56, "Akshatha");
    }


    //Example of returning a List of objects
    @RequestMapping("/listOfStudents")
    public List<Student> getAllStudents() {

        return Arrays.asList(
            new Student(1, "Neha"),
            new Student(2, "Rajesh"),
            new Student(3, "Ankita"),
            new Student(5, "Mohan"),
            new Student(6, "Rohan"),
            new Student(7, "Priyanka")
        );
    }
}
