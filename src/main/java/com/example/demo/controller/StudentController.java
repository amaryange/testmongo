package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/all")
    public List<Student> findAll(){
        return studentService.findAllStudent();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> findOne(@PathVariable Long id){
        return studentService.findOneStudent(id);
    }

}
