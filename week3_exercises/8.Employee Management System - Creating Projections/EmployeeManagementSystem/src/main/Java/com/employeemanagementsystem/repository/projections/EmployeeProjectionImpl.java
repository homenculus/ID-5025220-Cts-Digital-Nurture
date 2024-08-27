package com.employeemanagementsystem.repository.projections;

import com.employeemanagementsystem.model.Employee;

public class EmployeeProjectionImpl implements EmployeeProjection {

    private final Employee employee;

    public EmployeeProjectionImpl(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getEmployeeSummary() {
        return employee.getId() + " - " + employee.getName();
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public String getEmail() {
        return employee.getEmail();
    }
}
