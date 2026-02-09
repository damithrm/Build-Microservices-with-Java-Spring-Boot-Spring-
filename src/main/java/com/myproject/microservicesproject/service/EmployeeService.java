package com.myproject.microservicesproject.service;

import com.myproject.microservicesproject.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getemployeeById(String id);
}
