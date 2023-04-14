package pl.coderslab.logbook.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentController {
    private StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @RequestMapping("/view")
    @ResponseBody
    public List<Student> all(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
}
