package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee findById(String employeeId);

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee update(String employeeId, Employee employee);

    Employee delete(String employeeId);

    List<Employee> findByAgeLargerThan(Integer age);
}
