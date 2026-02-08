package com.myproject.microservicesproject.service;

import com.myproject.microservicesproject.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmployeeService {

    Employee save(Employee employee);

}
