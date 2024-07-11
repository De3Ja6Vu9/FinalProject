package com.example.Springboot.Repository;

import com.example.Springboot.Model.Address;
import com.example.Springboot.Model.Instructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InstructorRepositoryTest {
    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    AddressRepository addressRepository;

    Instructor instructor;

    @BeforeEach
    void setUp() {
        Address address = new Address(5, "Pallet Town", "15N");
        addressRepository.save(address);

        instructor = new Instructor("Sabrina");
        instructorRepository.save(instructor);
        System.out.println(instructor);
    }

    @AfterEach
    void tearDown() {
        instructorRepository.deleteById(instructor.getId());
        addressRepository.deleteById(5);
    }
    @Test
    public void findAll_instructors_instructorList(){
       List<Instructor> instructorList = instructorRepository.findAll();
       System.out.println(instructorList);
       assertEquals(5, instructorList.size());
    }

    @Test
    public void findAll_validId_correctInstructor() {
        Optional<Instructor> instructorOptional = instructorRepository.findById(1);
        assertTrue(instructorOptional.isPresent());
        System.out.println(instructorOptional.get());
        assertEquals("Brock", instructorOptional.get().getInstructor());
    }

    @Test
    public void findAll_instructors_invalidId_instructorNotPresent() {
        Optional<Instructor> instructorOptional = instructorRepository.findById(7);
        assertFalse(instructorOptional.isPresent());

    }
}