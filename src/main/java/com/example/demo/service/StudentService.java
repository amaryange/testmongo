package com.example.demo.service;

import com.example.demo.repository.StudfentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudfentRepository repository;

    public Student save(Student student){
        return repository.insert(student);
    }

    public List<Student> findAllStudent(){
        return repository.findAll();
    }

    public Optional<Student> findOneStudent(Long id){
        return repository.findById(id);
    }

    public void deleteOneStudent(Long id){
        repository.deleteById(id);
    }

}
