package com.employeemanagementsystem.repository.secondary;

import com.employeemanagementsystem.entity.secondary.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
