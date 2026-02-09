package com.myproject.microservicesproject.controller;

import com.myproject.microservicesproject.model.Employee;
import com.myproject.microservicesproject.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
       return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable String id) {
        return employeeService.getemployeeById(id);
    }
}
