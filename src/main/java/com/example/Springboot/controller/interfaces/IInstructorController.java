package com.example.Springboot.controller.interfaces;

import com.example.Springboot.Model.Instructor;

import java.util.List;

public interface IInstructorController {
    public List<Instructor> getAllInstructors();

    Instructor getInstructorById(Integer id);
}
