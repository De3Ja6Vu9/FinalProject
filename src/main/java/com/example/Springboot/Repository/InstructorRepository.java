package com.example.Springboot.Repository;

import com.example.Springboot.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository <Instructor, Integer> {

}

