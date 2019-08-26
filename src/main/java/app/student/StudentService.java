package app.student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<Student>(
        Arrays.asList(
            new Student(12, "Neha"),
            new Student(23, "Rajesh"),
            new Student(34, "Ankita"),
            new Student(55, "Mohan")
        ));


    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int id) {
        for (Student student : getAllStudents()) {
            if (student.id == id) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(int id, Student student) {
        for (int i = 0; i <= students.size(); i++) {
            Student std = students.get(i);
            if (std.id == id) {
                students.set(i, student);
                return;
            }
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.id == id) {
                students.remove(i);
                return;
            }
        }

    }

}
