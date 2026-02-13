package com.example.university;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.university.model.Student;
import com.example.university.respository.StudentRepository;

@SpringBootApplication
public class UniversityBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityBackendApplication.class, args);
	}

		@Bean
		CommandLineRunner init(StudentRepository studentRepository) {
			return args ->{
				// Add some sample students
				studentRepository.save(new Student(null, "John", "Doe", "john.doe@university.edu"));
				studentRepository.save(new Student(null, "Jane", "Smith", "jane.smith@university.edu"));
			};
		}
			
			
	

}
