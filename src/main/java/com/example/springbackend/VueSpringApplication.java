package com.example.springbackend;

import com.example.springbackend.entity.Employee;
import com.example.springbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VueSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = Employee.builder()
				.firstName("Rateepat")
				.lastName("Prajonthong")
				.email("example@test.com")
				.build();

		Employee employee2 = Employee.builder()
				.firstName("Pinkaew")
				.lastName("Horputra")
				.email("example2@test.com")
				.build();

		Employee employee3 = Employee.builder()
				.firstName("Example")
				.lastName("Test")
				.email("example3@test.com")
				.build();

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}
}
