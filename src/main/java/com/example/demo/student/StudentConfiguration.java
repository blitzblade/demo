package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student samson = new Student(
                    "Samson",
                    "samson.dadson@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.mann@gmail.com",
                    LocalDate.of(1993, Month.FEBRUARY, 9)
            );

            repository.saveAll(
                    List.of(samson, alex)
            );
        };
    }
}
