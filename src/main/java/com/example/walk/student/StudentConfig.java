package com.example.walk.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            List<Student> studentlist = Arrays.asList(new Student(1l,"TFS12022", "manmohan.pandey@gmail.com", LocalDate.of(1998, Month.FEBRUARY,10), 21));
            studentRepository.saveAll(studentlist);
        };
    }
}
