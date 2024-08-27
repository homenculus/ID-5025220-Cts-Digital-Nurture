package com.employeemanagementsystem.controller;

import com.employeemanagementsystem.model.Employee;
import com.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public Page<Employee> getAllEmployees(@RequestParam Optional<Integer> page,
                                          @RequestParam Optional<String> sortBy,
                                          @RequestParam Optional<String> direction) {
        Pageable pageable = PageRequest.of(page.orElse(0), 10, Sort.Direction.fromString(direction.orElse("asc")), sortBy.orElse("id"));
        return employeeRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(employeeDetails.getName());
            employee.setEmail(employeeDetails.getEmail());
            employee.setDepartment(employeeDetails.getDepartment());
            return ResponseEntity.ok(employeeRepository.save(employee));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id).map(employee -> {
            employeeRepository.delete(employee);
            return ResponseEntity.noContent().build();
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/department/{departmentName}")
    public Page<Employee> getEmployeesByDepartmentName(@PathVariable String departmentName,
                                                       @RequestParam Optional<Integer> page,
                                                       @RequestParam Optional<String> sortBy,
                                                       @RequestParam Optional<String> direction) {
        Pageable pageable = PageRequest.of(page.orElse(0), 10, Sort.Direction.fromString(direction.orElse("asc")), sortBy.orElse("id"));
        return employeeRepository.findByDepartmentName(departmentName, pageable);
    }

    @GetMapping("/search")
    public Page<Employee> searchEmployeesByName(@RequestParam("name") String name,
                                                @RequestParam Optional<Integer> page,
                                                @RequestParam Optional<String> sortBy,
                                                @RequestParam Optional<String> direction) {
        Pageable pageable = PageRequest.of(page.orElse(0), 10, Sort.Direction.fromString(direction.orElse("asc")), sortBy.orElse("id"));
        return employeeRepository.findByNameContaining(name, pageable);
    }
}
