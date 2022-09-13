package com.example.walk.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){

        // List<Student> student = Arrays.asList(new Student(1l,"TFS12022", "manmohan.pandey@gmail.com", LocalDate.of(1998, Month.FEBRUARY,10), 21));
        return studentRepository.findAll();
    }
}
