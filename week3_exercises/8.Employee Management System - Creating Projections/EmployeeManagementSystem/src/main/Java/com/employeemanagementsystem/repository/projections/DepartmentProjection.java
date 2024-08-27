package com.employeemanagementsystem.repository.projections;

import org.springframework.beans.factory.annotation.Value;

public interface DepartmentProjection {

    @Value("#{target.id} - #{target.name}")
    String getDepartmentSummary();

    String getName();
}
