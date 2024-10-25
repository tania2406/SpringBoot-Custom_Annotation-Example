package com.example.Springboot_Custom_Annotation.Repository;

import com.example.Springboot_Custom_Annotation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findByName(String name);
}
