package net.javaguides.springboot.tutorial.controller;

import net.javaguides.springboot.tutorial.entity.Student;
import net.javaguides.springboot.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/")
public class ApiController {
    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    public ApiController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public @ResponseBody List<Student> getStudents(String name) {
        return studentRepository.findByName(name);
    }
}
