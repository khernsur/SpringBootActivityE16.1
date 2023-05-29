package com.example.SpringBootActivityE16;

import com.example.SpringBootActivityE16.Entity.Course;
import com.example.SpringBootActivityE16.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {
}

