package com.employeemanagementsystem;

import com.employeemanagementsystem.entity.secondary.Department;
import com.employeemanagementsystem.repository.secondary.DepartmentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class DepartmentRepositoryTests {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void testSaveDepartment() {
        Department department = new Department();
        department.setName("HR");

        Department savedDepartment = departmentRepository.save(department);
        assertThat(savedDepartment).isNotNull();
        assertThat(savedDepartment.getId()).isGreaterThan(0);
    }
}
