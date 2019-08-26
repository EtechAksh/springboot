package app.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    // with @Autowired we don't need to specify StudentService studentService = new StudentService();
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    //equivalent to : @RequestMapping(method = RequestMethod.GET, value = "/students")
    //equivalent to : @RequestMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping("/students/{student_id}")
    public ResponseEntity getStudent(@PathVariable("student_id") int id) {
        Student student = studentService.getStudent(id);
        if (student != null) {
            return new ResponseEntity<Student>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<Student>(student, HttpStatus.NO_CONTENT);
        }
    }


    @PostMapping(value = "/students")
    //equivalent to : @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping("/students/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.updateStudent(id, student);
    }

    @DeleteMapping(value = "/students/{student_id}")
    public void deleteStudent(@PathVariable("student_id") int id) {
        studentService.deleteStudent(id);
    }
}
