package com.library.employeemanagementsystem.repository;

import com.library.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
         List<Employee> findByDepartment(String department);
}
