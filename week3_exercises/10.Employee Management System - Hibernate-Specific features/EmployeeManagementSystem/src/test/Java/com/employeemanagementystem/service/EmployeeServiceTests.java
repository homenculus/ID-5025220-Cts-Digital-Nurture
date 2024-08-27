package com.employeemanagementsystem.service;

import com.employeemanagementsystem.entity.primary.Employee;
import com.employeemanagementsystem.repository.primary.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
@Transactional
public class EmployeeServiceTests {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    public EmployeeServiceTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindEmployeeById() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Jane Doe");

        when(employeeRepository.findById(1L)).thenReturn(java.util.Optional.of(employee));
        Employee found = employeeService.getEmployeeById(1L);

        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("Jane Doe");
    }
}
