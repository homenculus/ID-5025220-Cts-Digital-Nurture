package com.employeemanagementsystem.repository.primary;

import com.employeemanagementsystem.entity.primary.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");
        employee = employeeRepository.save(employee);

        assertThat(employee.getId()).isNotNull();
        assertThat(employee.getName()).isEqualTo("John Doe");
    }
}
