package com.employeemanagementsystem;

import com.employeemanagementsystem.model.Department;
import com.employeemanagementsystem.model.Employee;
import com.employeemanagementsystem.repository.DepartmentRepository;
import com.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Department techDepartment = new Department();
        techDepartment.setName("Technology");
        departmentRepository.save(techDepartment);

        Employee emp1 = new Employee();
        emp1.setName("John Doe");
        emp1.setEmail("john.doe@example.com");
        emp1.setDepartment(techDepartment);
        employeeRepository.save(emp1);

        Employee emp2 = new Employee();
        emp2.setName("Jane Smith");
        emp2.setEmail("jane.smith@example.com");
        emp2.setDepartment(techDepartment);
        employeeRepository.save(emp2);
    }
}
