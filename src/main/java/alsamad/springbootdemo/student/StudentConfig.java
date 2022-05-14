package alsamad.springbootdemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "Smith",
                    "john98@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 1),
                    "ABC123");
            Student jane = new Student(
                    "Jane",
                    "Smith",
                    "janeS@gmail.com",
                    LocalDate.of(1999, Month.FEBRUARY, 1),
                    "ABC456");

            studentRepository.saveAll(
                    List.of(john, jane)
            );
        };

    }
}


