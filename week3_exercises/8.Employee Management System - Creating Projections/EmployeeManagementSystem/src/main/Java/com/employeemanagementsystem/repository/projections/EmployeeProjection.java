package com.employeemanagementsystem.repository.projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    @Value("#{target.id} - #{target.name}")
    String getEmployeeSummary();

    String getName();
    String getEmail();
}
