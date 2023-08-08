package com.msil.relationsnew.controller;

import com.msil.relationsnew.entity.Student;
import com.msil.relationsnew.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping
    public List<Student> getStudent()
    {
        return studentRepository.findAll();
    }
}
