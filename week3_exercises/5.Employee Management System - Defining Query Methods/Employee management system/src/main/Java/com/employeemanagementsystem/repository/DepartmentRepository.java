package com.employeemanagementsystem.repository;

import com.employeemanagementsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByName(String name);

    @Query("SELECT d FROM Department d WHERE d.name LIKE %:name%")
    Department searchByName(@Param("name") String name);
}
