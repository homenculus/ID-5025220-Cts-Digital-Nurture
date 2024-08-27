package com.employeemanagementsystem.repository.projections;

import com.employeemanagementsystem.model.Department;

public class DepartmentProjectionImpl implements DepartmentProjection {

    private final Department department;

    public DepartmentProjectionImpl(Department department) {
        this.department = department;
    }

    @Override
    public String getDepartmentSummary() {
        return department.getId() + " - " + department.getName();
    }

    @Override
    public String getName() {
        return department.getName();
    }
}
