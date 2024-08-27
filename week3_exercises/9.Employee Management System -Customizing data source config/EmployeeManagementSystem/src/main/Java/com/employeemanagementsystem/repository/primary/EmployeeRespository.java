package com.employeemanagementsystem.repository.primary;

import com.employeemanagementsystem.entity.primary.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
