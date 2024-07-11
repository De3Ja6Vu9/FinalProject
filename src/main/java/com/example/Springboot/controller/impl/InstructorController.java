package com.example.Springboot.controller.impl;

import com.example.Springboot.Model.Instructor;
import com.example.Springboot.Repository.InstructorRepository;
import com.example.Springboot.controller.interfaces.IInstructorController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class InstructorController implements IInstructorController {
    @Autowired
    InstructorRepository instructorRepository;

    @GetMapping("/instructor")
    public List<Instructor> getAllInstructors() {

        return instructorRepository.findAll();
    }

    @GetMapping("/instructor/{id}")
    public Instructor getInstructorById(@PathVariable Integer id){
        Optional<Instructor> instructorOptional = instructorRepository.findById(id);
        if(instructorOptional.isEmpty()) return null;
        return instructorOptional.get();
    }
}
